package com.example.matillion.matillion.task2.service.repository;

import com.example.matillion.matillion.task2.dao.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartamentRepository extends CrudRepository<Department, Long> {
    List<Department> findAllByDepartmentId(int departmentId);

}
