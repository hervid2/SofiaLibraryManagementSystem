package com.hernancardona.model.entity;

import com.hernancardona.model.enums.UserRole;
import java.time.LocalDate;

public class UserAccount {
    private Long id;
    private String email;
    private String passwordHash;
    private UserRole role;
    private Boolean active;
    private LocalDate createdAt;

    public UserAccount() {
    }

    public UserAccount(Boolean active, LocalDate createdAt, Long id, String email, String passwordHash, UserRole role) {
        this.active = active;
        this.createdAt = createdAt;
        this.id = id;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
