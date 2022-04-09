package com.klasevich.spring;

import com.klasevich.spring.config.AppConfig;
import com.klasevich.spring.persistance.entity.Employee;
import com.klasevich.spring.service.EmployeeService;
import com.klasevich.spring.service.FlywayService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {

        System.out.println("===================START APP======================");
        System.out.println("================START MIGRATION===================");
        FlywayService flywayService = new FlywayService();
        flywayService.migrate();

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        employeeService.saveEmployee(new Employee("Darina", "Dalidovich", "HR", 1200));

        System.out.println(employeeService.getAllEmployees());

    }
}
