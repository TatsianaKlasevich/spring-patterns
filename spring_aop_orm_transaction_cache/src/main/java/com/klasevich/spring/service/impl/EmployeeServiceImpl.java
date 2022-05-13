package com.klasevich.spring.service.impl;

import com.klasevich.spring.model.Employee;
import com.klasevich.spring.repository.EmployeeRepository;
import com.klasevich.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Transactional
    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    @Transactional(readOnly = true)
    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.getEmployee(id);
    }

    @Transactional
    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployee(id);
    }
}
