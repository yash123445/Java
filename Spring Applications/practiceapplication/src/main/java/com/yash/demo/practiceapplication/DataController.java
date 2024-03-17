package com.yash.demo.practiceapplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.demo.practiceapplication.entity.Student;
import com.yash.demo.practiceapplication.interfaces.StudentRepository;

@RestController
public class DataController {

    @Autowired
    private StudentRepository repo;

    @PostMapping("/student")
    public String addStudent(Student stud) {
        repo.save(stud);
        return "Student added";
    }

    @GetMapping("/student")
    public List<Student> getStudents() {
        return repo.findAll();
    }
    
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id) {
        Optional<Student> optionalStudent = repo.findById(id);
        if (optionalStudent.isPresent()) {
            repo.deleteById(id);
            return "Student deleted";
        } else {
            return "Student not found";
        }
    }
}
