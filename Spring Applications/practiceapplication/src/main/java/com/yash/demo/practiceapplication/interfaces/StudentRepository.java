package com.yash.demo.practiceapplication.interfaces;

import com.yash.demo.practiceapplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
