package com.Interfaces;

import com.entities.Appraisal;
import com.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppraisalRepository extends JpaRepository<Appraisal, Long> {
////    List<Appraisal> findByEmployee(Employee employee);
//    List<Appraisal> findByEmployee_Dept_id_DeptId(int dept_Id);
}
