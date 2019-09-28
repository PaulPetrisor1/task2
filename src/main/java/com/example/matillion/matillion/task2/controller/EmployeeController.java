package com.example.matillion.matillion.task2.controller;

import com.example.matillion.matillion.exception.NoDataFoundException;
import com.example.matillion.matillion.task2.dao.Employee;
import com.example.matillion.matillion.task2.service.EmployeeService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void getEmployeesByPayTypeEducationLevelAndDepartmentId(String payType, String departmentId, String educationLevel) throws NoDataFoundException {
        List<Employee> employees = employeeService.findAllByEducationDepartmentAndPayType(payType, departmentId, educationLevel);
        validateQuery(employees);
    }

    private static void validateQuery(List<Employee> employees) throws NoDataFoundException {
        if (!employees.isEmpty()) {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        } else {
            throw new NoDataFoundException("There were no entries matching your criteria, refine the search!");
        }
    }
}