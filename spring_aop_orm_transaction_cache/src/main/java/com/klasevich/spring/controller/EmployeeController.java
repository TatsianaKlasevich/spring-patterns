package com.klasevich.spring.controller;

import com.klasevich.spring.controller.dto.EmployeeRequestDto;
import com.klasevich.spring.controller.dto.EmployeeResponseDto;
import com.klasevich.spring.mapper.EmployeeRequestDtoToEmployeeMapper;
import com.klasevich.spring.mapper.EmployeeToEmployeeResponseDtoMapper;
import com.klasevich.spring.model.Employee;
import com.klasevich.spring.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController("/api/")
@RequiredArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;
    private EmployeeToEmployeeResponseDtoMapper employeeToEmployeeResponseDtoMapper;
    private EmployeeRequestDtoToEmployeeMapper employeeRequestDtoToEmployeeMapper;

    @GetMapping()
    public List<EmployeeResponseDto> showAllEmployees() {
        return employeeService.getAllEmployees().stream()
                .map(employeeToEmployeeResponseDtoMapper::convert)
                .collect(Collectors.toList());
    }

    @PostMapping()
    public void saveEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) {
        Employee employee = employeeRequestDtoToEmployeeMapper.convert(employeeRequestDto);
        employeeService.saveEmployee(employee);
    }

    @GetMapping("{employeeId}")
    public EmployeeResponseDto updateEmployee(@PathVariable Long employeeId) {
        return employeeToEmployeeResponseDtoMapper.convert(employeeService.getEmployee(employeeId));
    }

    @DeleteMapping("{employeeId}")
    public void deleteEmployee(@PathVariable Long employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}