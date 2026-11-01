package com.hernancardona.repository;

import com.hernancardona.model.entity.UserAccount;

public class UserAccountRepository extends  GenericRepository<UserAccount, Long> {
    UserAccountRepository() {
        super(UserAccount.class);
    }
}
