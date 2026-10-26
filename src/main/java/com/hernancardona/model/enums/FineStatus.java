package com.hernancardona.model.enums;

public enum FineStatus {
    PENDING(1,"Pending","Fine pending to be pid"),
    PAID(2,"Paid","Fine already paid"),
    WAIVED(3,"Waived","Fine waived");

    //  Attributes
    private final int id;
    private final String name;
    private final String description;

    // Constructor (no an empty constructor can be declared within an enum)
    FineStatus (int id, String name, String description) {
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
    public boolean isPending() {
        return this == PENDING;
    }

    public boolean wasPaid() {
        return this == PAID;
    }

    public boolean wasWaived() {
        return this == WAIVED;
    }


    @Override
    public String toString() {
        return name;
    }
}
