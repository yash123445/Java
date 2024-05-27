package com.bankapp.bankApp.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapp.bankApp.entities.Branch;

public interface BranchRepository extends JpaRepository<Branch,Integer>{

}