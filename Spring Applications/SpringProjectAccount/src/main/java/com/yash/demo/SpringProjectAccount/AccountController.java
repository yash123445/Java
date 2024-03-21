package com.yash.demo.SpringProjectAccount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.yash.demo.SpringProjectAccount.Interfaces.AccountRepository;
import com.yash.demo.SpringProjectAccount.Interfaces.BranchRepository;
import com.yash.demo.SpringProjectAccount.Interfaces.LoanRepository;
import com.yash.demo.SpringProjectAccount.entities.Account;
import com.yash.demo.SpringProjectAccount.entities.Branch;
import com.yash.demo.SpringProjectAccount.entities.Loan;

@Controller
public class AccountController {
    
    @Autowired
    private AccountRepository repo;
    
    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private LoanRepository loanRepository;
    
    @GetMapping("/account")
    public String showAccountPage() {
        return "account"; // This will return the "account.html" page from the "resources/templates" directory
    }
    
    @PostMapping("/account")
    public String addAccount(Account act) {
        repo.save(act);
        return "redirect:/account"; // Redirect to the "/account" endpoint after saving the account
    }
   
    // Endpoint to get all bank accounts
    @GetMapping("/bankAccounts")
    public List<Account> getAllBankAccounts() {
        return repo.findAll();
    }

    // Endpoint to get all loans
    @GetMapping("/loans")
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    // Endpoint to create a new loan
    @PostMapping("/loans")
    public Loan createLoan(@RequestBody Loan loan) {
        return loanRepository.save(loan);
    }
}
