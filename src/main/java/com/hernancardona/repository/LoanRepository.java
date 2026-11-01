package com.hernancardona.repository;

import com.hernancardona.model.entity.Loan;

public class LoanRepository extends  GenericRepository<Loan, Long> {
    public LoanRepository() {
        super(Loan.class);
    }
}
