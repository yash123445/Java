package com.yash.demo.SpringProjectAccount.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.demo.SpringProjectAccount.entities.Branch;

public interface BranchRepository extends JpaRepository<Branch,Integer>{

}
