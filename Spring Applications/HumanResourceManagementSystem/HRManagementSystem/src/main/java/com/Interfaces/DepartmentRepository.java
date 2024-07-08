package com.Interfaces;

import org.springframework.data.repository.CrudRepository;
import com.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {}
