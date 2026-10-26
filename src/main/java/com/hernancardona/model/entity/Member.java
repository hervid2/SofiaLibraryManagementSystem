package com.hernancardona.model.entity;

import java.util.List;

public class Member {
    private Long id;
    private String name;
    private String phone;
    private UserAccount account;
    private List<Loan> loans;
    private List<Reservation> reservations;

    public Member() {
    }

    public Member(UserAccount account, Long id, List<Loan> loans, String name,
                  String phone, List<Reservation> reservations) {
        this.account = account;
        this.id = id;
        this.loans = loans;
        this.name = name;
        this.phone = phone;
        this.reservations = reservations;
    }

    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
