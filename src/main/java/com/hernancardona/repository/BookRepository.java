package com.hernancardona.repository;


import com.hernancardona.model.entity.Book;
import com.hernancardona.config.JPAUtil;
import jakarta.persistence.EntityManager;
import java.util.List;

public class BookRepository extends GenericRepository<Book, Long> {

    public BookRepository() {
        super(Book.class);
    }


}