package com.yash.demo.SpringProjectAccount.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.demo.SpringProjectAccount.entities.Loan;

public interface LoanRepository extends JpaRepository<Loan,Integer>{

}
