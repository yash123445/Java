package com.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Interfaces.AppraisalRepository;
import com.Interfaces.EmployeeRepository;
import com.entities.Appraisal;

@Controller
@RequestMapping("/appraisals")
public class AppraisalController {

    @Autowired
    private AppraisalRepository appraisalRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/form")
    public String showAppraisalForm(Model model) {
        model.addAttribute("appraisal", new Appraisal());
        model.addAttribute("employees", employeeRepository.findAll());
        return "appraisal";
    }

    @GetMapping("/all")
    public String getAllAppraisals(Model model) {
        List<Appraisal> appraisals = appraisalRepository.findAll();
        model.addAttribute("appraisals", appraisals);
        return "appraisals"; // Ensure you have a Thymeleaf template named 'appraisals.html'
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Appraisal> appraisalOptional = appraisalRepository.findById(id);
        if (appraisalOptional.isPresent()) {
            model.addAttribute("appraisal", appraisalOptional.get());
            model.addAttribute("employees", employeeRepository.findAll());
            return "appraisal";
        } else {
            return "redirect:/appraisals/all";
        }
    }

    @PostMapping("/save")
    public String saveAppraisal(Appraisal appraisal) {
        appraisalRepository.save(appraisal);
        return "redirect:/appraisals/all";
    }
}
