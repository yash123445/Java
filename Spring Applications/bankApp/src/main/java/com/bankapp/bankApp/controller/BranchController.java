package com.bankapp.bankApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bankapp.bankApp.entities.Branch;
import com.bankapp.bankApp.interfaces.BranchRepository;

@Controller
public class BranchController {
	
	@Autowired
	private BranchRepository branchRepository;
	
	@GetMapping("/branch")
	public String showBranchForm() {
		return "branch"; // This will return the "branch.html" page from the "resources/templates" directory
	}

	@GetMapping("/branches")
    @ResponseBody
    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }

    // Endpoint to create a new branch
    @PostMapping("/branch")
    public String createBranch(Branch brn) {
        branchRepository.save(brn);
        return "redirect:/branch";
    }
    
    
}