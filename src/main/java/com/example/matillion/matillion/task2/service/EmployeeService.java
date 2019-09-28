package com.example.matillion.matillion.task2.service;

import com.example.matillion.matillion.task2.dao.Employee;
import com.example.matillion.matillion.task2.service.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllByEducationDepartmentAndPayType(String payType, String departmentName, String educationLevel) {
        return employeeRepository.findAllByPositionId_PayTypeAndDepartmentId_DepartmentDescriptionAndEducationLevel(payType, departmentName, educationLevel);

    }

}
