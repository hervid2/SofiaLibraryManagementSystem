package com.hernancardona.repository;

import com.hernancardona.model.entity.BookCopy;

public class BookCopyRepository extends GenericRepository<BookCopy, Long> {
    public BookCopyRepository() {
        super(BookCopy.class);
    }
}
