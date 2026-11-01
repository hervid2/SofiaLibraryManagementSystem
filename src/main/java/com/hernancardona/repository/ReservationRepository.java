package com.hernancardona.repository;

import com.hernancardona.model.entity.Reservation;

public class ReservationRepository extends GenericRepository<Reservation, Long> {
    public ReservationRepository() {
        super(Reservation.class);
    }
}
