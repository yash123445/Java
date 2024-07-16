package com.Interfaces;

import org.springframework.data.repository.CrudRepository;
import com.entities.DeletedEmployee;

public interface DeletedEmployeeRepository extends CrudRepository<DeletedEmployee, Integer> {
}

