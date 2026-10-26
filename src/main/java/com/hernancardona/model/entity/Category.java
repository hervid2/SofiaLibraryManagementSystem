package com.hernancardona.model.entity;
import jakarta.persistence.*;
import org.hibernate.annotations.SoftDelete;
import org.hibernate.annotations.SoftDeleteType;

import java.util.List;

@Entity
@Table(name = "categories")
@SoftDelete(strategy = SoftDeleteType.DELETED, columnName = "deleted")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Book> books;

    public Category() {
    }

    public Category(List<Book> books, Long id, String name) {
        this.books = books;
        this.id = id;
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String  getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
