package com.klasevich.spring.controller.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmployeeResponseDto {

    private Long id;

    private String name;

    private String surname;

    private String department;

    private int salary;
}
