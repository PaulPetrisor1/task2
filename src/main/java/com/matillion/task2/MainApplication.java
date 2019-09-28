package com.matillion.task2;

import com.matillion.task2.exception.QuerryException;
import com.matillion.task2.controller.EmployeeController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

    private final EmployeeController employeeController;

    public MainApplication(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws QuerryException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter payment type:");
        String payType = scanner.nextLine();
        System.out.println("Enter department description:");
        String departmentId = scanner.nextLine();
        System.out.println("Enter education level:");
        String educationLevel = scanner.nextLine();
        System.out.println();
        System.out.println("Your query result: ");
        employeeController.getEmployeesByPayTypeEducationLevelAndDepartmentId(payType, departmentId, educationLevel);
    }

}

