package com.hernancardona.repository;

import com.hernancardona.model.entity.Librarian;

public class LibrarianRepository extends GenericRepository<Librarian, Long> {
    public LibrarianRepository() {
        super(Librarian.class);
    }
}
