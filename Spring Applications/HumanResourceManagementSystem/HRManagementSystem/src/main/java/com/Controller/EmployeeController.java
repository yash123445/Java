package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.Interfaces.DepartmentRepository;
import com.Interfaces.EmployeeRepository;
import com.entities.Employee;

@Controller
@RequestMapping("/employees") // Adding a base URL to all mappings in this controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private DepartmentRepository departmentRepo;

    @GetMapping
    @ResponseBody
    public List<Employee> getEmployees() {
        return (List<Employee>) employeeRepo.findAll();
    }

    @GetMapping("/employee")
    public String showAddEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        model.addAttribute("departments", departmentRepo.findAll());
        return "employee";
    }

    @PostMapping("/employee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeRepo.save(employee);
        return "redirect:/employees/employee";
    }

    @GetMapping("/profile/{id}")
    public String viewProfile(@PathVariable int id, Model model) {
        Employee employee = employeeRepo.findById(id);
        if (employee != null) {
            model.addAttribute("employee", employee);
            return "viewProfile";
        } else {
            return "error";
        }
    }

    @GetMapping("/edit/{id}")
    public String editProfile(@PathVariable int id, Model model) {
        Employee employee = employeeRepo.findById(id);
        if (employee != null) {
            model.addAttribute("employee", employee);
            model.addAttribute("departments", departmentRepo.findAll());
            return "editProfile";
        } else {
            return "error";
        }
    }

    @PostMapping("/edit/{id}")
    public String updateProfile(@PathVariable int id, @ModelAttribute("employee") Employee employee) {
        employee.setEmp_id(id);
        employeeRepo.save(employee);
        return "redirect:/employees/profile/" + id;
    }

    @DeleteMapping("/{emp_id}")
    @ResponseBody
    public String deleteEmployee(@PathVariable int emp_id) {
        try {
            employeeRepo.deleteById(emp_id);
            return "Employee Deleted Successfully";
        } catch (Exception e) {
            e.printStackTrace();
            return "Employee Not Found";
        }
    }
}

