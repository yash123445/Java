package com.yash.demo.SpringProjectAccount.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.demo.SpringProjectAccount.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    
}
