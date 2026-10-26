package com.hernancardona.model.enums;

public enum LoanStatus {
    ACTIVE(1,"Active","Loan is active"),
    OVERDUE(2,"Overdue","Loan is Overdue"),
    RETURNED(3,"Returned","Book has been returned back");

    //  Attributes
    private final int id;
    private final String name;
    private final String description;

    // Constructor (no an empty constructor can be declared within an enum)
    LoanStatus (int id, String name, String description) {
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
    public boolean isActive() {
        return this == ACTIVE;
    }

    public boolean isOverdue() {return this == OVERDUE;}

    public boolean wasReturned() {
        return this == RETURNED;
    }


    @Override
    public String toString() {
        return name;
    }
}
