package com.bankapp.bankApp.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.bankApp.entities.Account;
import com.bankapp.bankApp.interfaces.AccountRepository;

import jakarta.transaction.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	@Transactional
	public void withdraw(Long actNo, BigDecimal amount) {
		Account account = accountRepository.findByactNo(actNo)
				.orElseThrow(() -> new RuntimeException("Account not found: " + actNo));

		if (account.getBalance().compareTo(amount) < 0) {
			throw new RuntimeException("Insufficient funds for account ID: " + actNo);
		}

		account.setBalance(account.getBalance().subtract(amount));
		accountRepository.save(account);
	}

	@Override
	public void deposit(Long actNo, BigDecimal amount) {
		Account account = accountRepository.findByactNo(actNo)
				.orElseThrow(() -> new RuntimeException("Account not found: " + actNo));

		account.setBalance(account.getBalance().add(amount));
		accountRepository.save(account);
	}

	@Override
	public void update(Account account) {
		// Check if the account exists
		Account existingAccount = accountRepository.findByactNo(account.getActNo())
				.orElseThrow(() -> new IllegalArgumentException("Account not found"));

		// Update the existing account with new values
		existingAccount.setHolderName(account.getHolderName());
		existingAccount.setEmail(account.getEmail());
		existingAccount.setMobileNo(account.getMobileNo());
		existingAccount.setAadharNo(account.getAadharNo());
		// Add more fields as necessary

		// Save the updated account back to the repository
		accountRepository.save(existingAccount);
	}

	@Override
	public Account findByactNo(Long actNo) {
		return accountRepository.findByactNo(actNo)
				.orElseThrow(() -> new IllegalArgumentException("Account not found"));
	}

	@Override
    @Transactional
    public void deleteAccountById(Long actNo) {
        Account account = accountRepository.findByactNo(actNo)
                .orElseThrow(() -> new RuntimeException("Account does not exist"));

        accountRepository.deleteByactNo(actNo);
    }

		
	}

	
//	public void deleteAccountById(Long actNo) {
//        Account account = accountRepository.
//        		findByactNo(actNo).
//        		orElseThrow(()-> new RuntimeException("Account does not exists"));
//        
//        accountRepository.deleteByactNo(actNo);
//        }


