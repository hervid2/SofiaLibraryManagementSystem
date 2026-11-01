package com.hernancardona.repository;

import com.hernancardona.model.entity.Category;

public class CategoryRepository extends GenericRepository<Category, Long>{
    public CategoryRepository() {

        super(Category.class);
    }
}
