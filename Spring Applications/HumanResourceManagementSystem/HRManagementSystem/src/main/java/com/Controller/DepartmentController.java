package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.Interfaces.DepartmentRepository;
import com.entities.Department;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepo;

    @GetMapping
    public String showAddDepartment(Model model) {
        Department department = new Department();
        model.addAttribute("department", department);
        return "department";
    }

    @PostMapping
    public String saveDepartment(@ModelAttribute("department") Department department) {
        departmentRepo.save(department);
        return "redirect:/department";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Department> getDepartments() {
        return (List<Department>) departmentRepo.findAll();
    }

    @DeleteMapping("/{dept_id}")
    @ResponseBody
    public String deleteDepartment(@PathVariable int dept_id) {
        try {
            departmentRepo.deleteById(dept_id);
            return "Department Deleted Successfully";
        } catch (Exception e) {
            e.printStackTrace();
            return "Department Not Found";
        }
    }
}
