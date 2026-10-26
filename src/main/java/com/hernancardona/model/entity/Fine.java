package com.hernancardona.model.entity;

import com.hernancardona.model.enums.FineStatus;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Fine {
    private Long id;
    private Loan loan;
    private BigDecimal amount;
    private LocalDate issuedDate;
    private LocalDate paidDate;
    private FineStatus fineStatus;

    public Fine() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public LocalDate getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDate paidDate) {
        this.paidDate = paidDate;
    }

    public FineStatus getStatus() {
        return fineStatus;
    }

    public void setStatus(FineStatus status) {
        this.fineStatus = fineStatus;
    }
}
