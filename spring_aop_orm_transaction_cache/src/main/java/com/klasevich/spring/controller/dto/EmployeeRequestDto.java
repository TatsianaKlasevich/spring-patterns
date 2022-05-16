package com.klasevich.spring.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmployeeRequestDto {

    @NonNull
    private String name;

    @NonNull
    private String surname;

    @NonNull
    private String department;

    @NonNull
    private int salary;
}
