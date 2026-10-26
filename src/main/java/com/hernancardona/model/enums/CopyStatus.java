package com.hernancardona.model.enums;

public enum CopyStatus {
    AVAILABLE(1,"Available","Book available for loan"),
    BORROWED(2,"Borrowed","Book already borrowed"),
    RESERVED(3,"Reserved","Book previously reserved"),
    DAMAGED(4,"Damaged","Book damaged"),
    LOST(5,"Lost","Book has been lost");


    //  Attributes
    private final int id;
    private final String name;
    private final String description;

    // Constructor (no an empty constructor can be declared within an enum)
    CopyStatus (int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //  Getters


    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //  Additional methods
    public boolean isAvailable() {
        return this == AVAILABLE;
    }

    public boolean wasBorrowed() {
        return this == BORROWED;
    }

    public boolean wasReserved() {
        return this == RESERVED;
    }

    public boolean wasDamaged() {return this == DAMAGED;}

    public boolean wasLost() {return this == LOST;}

    @Override
    public String toString() {
        return name;
    }
}
