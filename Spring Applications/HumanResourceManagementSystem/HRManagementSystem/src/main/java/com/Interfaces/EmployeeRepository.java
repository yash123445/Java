package com.Interfaces;

import org.springframework.data.repository.CrudRepository;
import com.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {}
