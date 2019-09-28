package com.example.matillion.matillion.task2.service;

import com.example.matillion.matillion.task2.dao.Department;
import com.example.matillion.matillion.task2.service.repository.DepartamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartamentRepository departamentRepository;

    public List<Department> findAllByDepartmentId(int departmentId) {
        return departamentRepository.findAllByDepartmentId(departmentId);
    }
}
