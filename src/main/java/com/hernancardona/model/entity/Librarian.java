package com.hernancardona.model.entity;

import java.util.List;

public class Librarian {
    private Long id;
    private String name;
    private String phone;
    private UserAccount account;
    private List<Loan> processedLoans;

    public Librarian() {
    }

    public Librarian(UserAccount account, Long id, String name, String phone, List<Loan> processedLoans) {
        this.account = account;
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.processedLoans = processedLoans;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Loan> getProcessedLoans() {
        return processedLoans;
    }

    public void setProcessedLoans(List<Loan> processedLoans) {
        this.processedLoans = processedLoans;
    }
}
