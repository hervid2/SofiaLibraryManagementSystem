package com.hernancardona.repository;

import com.hernancardona.model.entity.Fine;

public class FineRepository extends GenericRepository<Fine, Long> {
    public FineRepository() {

        super(Fine.class);
    }
}
