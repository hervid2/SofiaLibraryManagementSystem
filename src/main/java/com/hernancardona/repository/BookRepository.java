package com.hernancardona.repository;


import com.hernancardona.model.entity.Book;
import com.hernancardona.config.JPAUtil;
import jakarta.persistence.EntityManager;
import java.util.List;

public class BookRepository extends GenericRepository<Book, Long> {

    public BookRepository() {
        super(Book.class);
    }

    public List<Book> findByTitle(String text) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery(
                            "SELECT b FROM Book b WHERE LOWER(b.title) LIKE LOWER(:t)", Book.class)
                    .setParameter("t", "%" + text + "%")
                    .getResultList();
        } finally {
            em.close();
        }
    }

    // Trae el libro con su categoría y copias ya cargadas (evita LazyInitializationException)
    public Book findByIdWithCopies(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery(
                            "SELECT b FROM Book b " +
                                    "LEFT JOIN FETCH b.category " +
                                    "LEFT JOIN FETCH b.copies " +
                                    "WHERE b.id = :id", Book.class)
                    .setParameter("id", id)
                    .getResultStream()
                    .findFirst()
                    .orElse(null);
        } finally {
            em.close();
        }
    }
}