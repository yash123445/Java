package com.bankapp.bankApp.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bankapp.bankApp.entities.Account;
import com.bankapp.bankApp.interfaces.AccountRepository;
import com.bankapp.bankApp.interfaces.BranchRepository;
import com.bankapp.bankApp.services.AccountService;

@Controller
public class AccountController {

    @Autowired
    private AccountRepository repo;

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private AccountService accountService;
    
    @GetMapping("/index")
    public String showHomePage() {
    	return "index";
    }

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

//    @GetMapping("/withdraw")
//    public String showWithdrawForm(Model model) {
//        model.addAttribute("actNo", 1); // Default account ID or from session, etc.
//        return "withdraw";
//    }

    @GetMapping("/withdraw")
    public String showWithdrawFormForAccount(/*@PathVariable Long actNo,*/ Model model) {
        model.addAttribute("actNo"/*, actNo*/); // Account ID from the URL
        return "withdraw";
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam Long actNo, @RequestParam BigDecimal balance, Model model) {
        try {
            accountService.withdraw(actNo, balance);
            model.addAttribute("message", new Message("Withdrawal successful", "success"));
        } catch (RuntimeException e) {
            model.addAttribute("message", new Message(e.getMessage(), "error"));
        }
        model.addAttribute("actNo", actNo); // Keep the account ID for form resubmission
        return "withdraw";
    }

    @GetMapping("/deposit")
    public String showDepositFormForAccount(/*@PathVariable Long actNo,*/ Model model) {
        model.addAttribute("actNo"/*, actNo*/); // Account ID from the URL
        return "deposit";
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam Long actNo, @RequestParam BigDecimal balance, Model model) {
        try {
            accountService.deposit(actNo, balance);
            model.addAttribute("message", new Message("Deposit successful", "success"));
        } catch (RuntimeException e) {
            model.addAttribute("message", new Message(e.getMessage(), "error"));
        }
        model.addAttribute("actNo", actNo); // Keep the account ID for form resubmission
        return "deposit";
    }

    
//    @GetMapping("/{actNo}/update")
//    public String showUpdateForm(@PathVariable("actNo") Long actNo, Model model) {
//        Account account = accountService.findByactNo(actNo);
//        model.addAttribute("actNo", actNo);
//        return "update";
//    }
//
//    @PostMapping("/{actNo}/update")
//    public String updateAccount(@ModelAttribute("account") Account account) {
//        accountService.update(account);
//        return "redirect:/account/update/" + account.getActNo();
//    }
    
    @GetMapping("/delete")
    public String showDeleteForm(Model model) {
        model.addAttribute("account", new Account());
        return "delete";
    }


    @PostMapping("/deleteAccount")
    public ResponseEntity<String> deleteAccount(@RequestParam("actNo") Long actNo) {
        accountService.deleteAccountById(actNo);
        return ResponseEntity.ok("Account deleted successfully");
    }



    public static class Message {
        private String text;
        private String type;

        public Message(String text, String type) {
            this.text = text;
            this.type = type;
        }

        public String getText() {
            return text;
        }

        public String getType() {
            return type;
        }
    }
}
