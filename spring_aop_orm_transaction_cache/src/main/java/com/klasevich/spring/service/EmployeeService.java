package com.klasevich.spring.service;

import com.klasevich.spring.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(Long id);

    void deleteEmployee(Long id);
}
