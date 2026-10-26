package com.hernancardona.model.entity;

import com.hernancardona.model.enums.LoanStatus;
import java.time.LocalDate;

public class Loan {

    private Long id;
    private Member member;
    private Librarian librarian;
    private BookCopy bookCopy;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private LoanStatus status;

    public Loan() {
    }

    public Loan(BookCopy bookCopy, LocalDate dueDate, Long id, Librarian librarian, LocalDate loanDate,
                Member member, LocalDate returnDate, LoanStatus status) {
        this.bookCopy = bookCopy;
        this.dueDate = dueDate;
        this.id = id;
        this.librarian = librarian;
        this.loanDate = loanDate;
        this.member = member;
        this.returnDate = returnDate;
        this.status = status;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }
}
