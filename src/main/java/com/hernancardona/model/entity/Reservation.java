package com.hernancardona.model.entity;

import com.hernancardona.model.enums.ReservationStatus;
import java.time.LocalDateTime;

public class Reservation {
    private Long id;
    private Member member;
    private Book book;
    private LocalDateTime reservationDate;
    private LocalDateTime expirationDate;
    private ReservationStatus reservationsStatus;

    public Reservation() {
    }

    public Reservation(Book book, LocalDateTime expirationDate, Long id, Member member,
                       LocalDateTime reservationDate, ReservationStatus reservationsStatus) {
        this.book = book;
        this.expirationDate = expirationDate;
        this.id = id;
        this.member = member;
        this.reservationDate = reservationDate;
        this.reservationsStatus = reservationsStatus;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public ReservationStatus getStatus() {
        return reservationsStatus;
    }

    public void setStatus(ReservationStatus reservationsStatus) {
        this.reservationsStatus = reservationsStatus;
    }
}
