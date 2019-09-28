package com.example.matillion.matillion.task2.service.repository;

import com.example.matillion.matillion.task2.dao.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findAllByPositionId_PayTypeAndDepartmentId_DepartmentDescriptionAndEducationLevel(String payType, String departId, String educationLevel);
}
