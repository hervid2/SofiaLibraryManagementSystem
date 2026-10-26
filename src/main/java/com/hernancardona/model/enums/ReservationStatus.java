package com.hernancardona.model.enums;

public enum ReservationStatus {
    PENDING(1,"Pending","Reservation is pending"),
    READY(2,"Ready","Reservation is ready"),
    FULFILLED(3,"Fulfilled","Reservation has been fulfilled"),
    CANCELLED(4,"Cancelled","Reservation has been cancelled"),
    EXPIRED(5,"Expired","Reservation has Expired");

    //  Attributes
    private final int id;
    private final String name;
    private final String description;

    // Constructor (no an empty constructor can be declared within an enum)
    ReservationStatus(int id, String name, String description) {
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
    public boolean isPending() {
        return this == PENDING;
    }

    public boolean isReady() {
        return this == READY;
    }

    public boolean isFulfilled() {
        return this == FULFILLED;
    }

    public boolean wasCancelled() {
        return this == CANCELLED;
    }

    public boolean isExpired() {
        return this == EXPIRED;
    }

    @Override
    public String toString() {
        return name;
    }
}
