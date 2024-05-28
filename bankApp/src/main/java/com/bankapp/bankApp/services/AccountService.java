package com.bankapp.bankApp.services;

import java.math.BigDecimal;

import com.bankapp.bankApp.entities.Account;

public interface AccountService {
    void withdraw(Long actNo, BigDecimal balance);
    void deposit(Long actNo, BigDecimal balance);
    void update(Account account);
    Account findByactNo(Long actNo);
	void deleteAccountById(Long actNo);
}
