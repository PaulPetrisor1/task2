package com.matillion.task2.service;

import com.matillion.task2.dao.Department;
import com.matillion.task2.service.repository.DepartamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartamentRepository departamentRepository;

    public DepartmentService(DepartamentRepository departamentRepository) {
        this.departamentRepository = departamentRepository;
    }

    public List<Department> findAllByDepartmentId(int departmentId) {
        return departamentRepository.findAllByDepartmentId(departmentId);
    }
}
