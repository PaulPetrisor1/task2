package com.matillion.task2.controller;

import com.matillion.task2.exception.QuerryException;
import com.matillion.task2.dao.Employee;
import com.matillion.task2.service.EmployeeService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void getEmployeesByPayTypeEducationLevelAndDepartmentId(String payType, String departmentId, String educationLevel) throws QuerryException {
        List<Employee> employees = employeeService.findAllByEducationDepartmentAndPayType(payType, departmentId, educationLevel);
        validateQuery(employees);
    }

    private static void validateQuery(List<Employee> employees) throws QuerryException{
        if (!employees.isEmpty()) {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        } else {
            throw new QuerryException("There were no records...");
        }
    }
}