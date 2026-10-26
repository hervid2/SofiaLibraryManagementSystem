package com.hernancardona.model.enums;

public enum UserRole {

    ADMINISTRATOR(1, "Administrator", "Full system access"),
    LIBRARIAN(2, "Librarian", "Manages books and members"),
    MEMBER(3, "Member", "Borrows and reserves books");

    //  Attributes
    private final int id;
    private final String name;
    private final String description;

    // Constructor (no an empty constructor can be declared within an enum)
    UserRole(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //  Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //  Additional methods
    public boolean isAdministrator() {
        return this == ADMINISTRATOR;
    }

    public boolean isLibrarian() {
        return this == LIBRARIAN;
    }

    public boolean isMember() {
        return this == MEMBER;
    }

    @Override
    public String toString() {
        return name;
    }
}

