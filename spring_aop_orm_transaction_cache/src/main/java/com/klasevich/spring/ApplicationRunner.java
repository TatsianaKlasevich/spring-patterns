package com.klasevich.spring;

import com.klasevich.spring.config.AppConfig;
import com.klasevich.spring.repository.EmployeeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
//        employeeRepository.saveEmployee(new Employee("Darina", "Dalidovich", "HR", 1200));

        System.out.println(employeeRepository.getAllEmployees());
    }
}
