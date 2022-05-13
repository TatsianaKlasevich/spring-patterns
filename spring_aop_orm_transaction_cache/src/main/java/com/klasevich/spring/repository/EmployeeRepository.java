package com.klasevich.spring.repository;

import com.klasevich.spring.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(Long id);

    void deleteEmployee(Long id);
}
