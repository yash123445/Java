package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Interfaces.DeletedEmployeeRepository;
import com.entities.DeletedEmployee;

import java.util.List;

@Controller
public class DeletedEmployeeController {

    @Autowired
    private DeletedEmployeeRepository deletedEmployeeRepository;

    @GetMapping("/deleted-employees")
    public String showDeletedEmployees(Model model) {
        List<DeletedEmployee> deletedEmployees = (List<DeletedEmployee>) deletedEmployeeRepository.findAll();
        model.addAttribute("deletedEmployees", deletedEmployees);
        return "deletedEmployeesList"; // Thymeleaf template name
    }
}
