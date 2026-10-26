package com.hernancardona.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory emf;

    private JPAUtil() {
    } // evita new JPAUtil()

    static {
        try {
            // Inicializa la unidad de persistencia una sola vez al arrancar la app
            emf = Persistence.createEntityManagerFactory("sofiaLibraryMagementSystemPU");
        } catch (Throwable ex) {
            System.err.println("Error al inicializar el EntityManagerFactory: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void close() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
