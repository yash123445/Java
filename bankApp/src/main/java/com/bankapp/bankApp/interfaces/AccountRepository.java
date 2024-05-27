package com.bankapp.bankApp.interfaces;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.bankApp.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	Optional<Account> findByactNo(Long accountId);

	void deleteByactNo(Long actNo);

	boolean existsByactNo(Long actNo);
    
	
}