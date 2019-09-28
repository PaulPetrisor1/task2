package com.example.matillion.matillion.task2;

import com.example.matillion.matillion.exception.NoDataFoundException;
import com.example.matillion.matillion.task2.controller.EmployeeController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Task2Application implements CommandLineRunner {

    private final EmployeeController employeeController;

    public Task2Application(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public static void main(String[] args) {
        SpringApplication.run(Task2Application.class, args);
    }

    @Override
    public void run(String... args) throws NoDataFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter payment type:");
        String payType = scanner.nextLine();
        System.out.println("Enter department description:");
        String departmentId = scanner.nextLine();
        System.out.println("Enter education level:");
        String educationLevel = scanner.nextLine();
        employeeController.getEmployeesByPayTypeEducationLevelAndDepartmentId(payType, departmentId, educationLevel);
    }

}

