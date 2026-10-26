package com.hernancardona.repository;

import com.hernancardona.model.entity.BookCopy;
import jakarta.persistence.EntityManager;

public class BookCopyRepository extends GenericRepository<BookCopy, Long>{
    public BookCopyRepository() {
        super(BookCopy.class);
    }
}
