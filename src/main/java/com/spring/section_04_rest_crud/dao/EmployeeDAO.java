package com.spring.section_04_rest_crud.dao;

import com.spring.section_04_rest_crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);


}
