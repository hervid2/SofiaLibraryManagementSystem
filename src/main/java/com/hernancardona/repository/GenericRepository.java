package com.hernancardona.repository;

import com.hernancardona.exception.BusinessException;
import com.hernancardona.exception.DataAccessException;
import com.hernancardona.config.JPAUtil;
import jakarta.persistence.EntityManager;
import java.util.List;
import java.util.function.Function;


public abstract class GenericRepository<T, ID> {
    private final Class<T> entityClass;

    protected GenericRepository(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public T create(T entity) {
        return executeInTransaction(em -> {
            em.persist(entity);
            return entity;
        });
    }

    public T update(T entity) {
        return executeInTransaction(em -> em.merge(entity));
    }

    public void delete(ID id) {
        executeInTransaction(em -> {
            T entity = em.find(entityClass, id);
            if (entity != null) {
                em.remove(entity);
            }
            return null;
        });
    }

    public T findById(ID id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(entityClass, id);
        } finally {
            em.close();
        }
    }

    public List<T> findAll() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    // Handle EntityManager, transacción, commit and rollback in one single place
    protected <R> R executeInTransaction(Function<EntityManager, R> action) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            R result = action.apply(em);
            em.getTransaction().commit();
            return result;
        } catch (RuntimeException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            // Exceptions business go through, DB ones translate them here
            if (e instanceof BusinessException){
                throw e;
            }
            throw new DataAccessException("Error trying to accessing Database",e);
        } finally {
            em.close();
        }
    }
}

