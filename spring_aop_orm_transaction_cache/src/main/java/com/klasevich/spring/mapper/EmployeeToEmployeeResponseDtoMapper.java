package com.klasevich.spring.mapper;

import com.klasevich.spring.controller.dto.EmployeeResponseDto;
import com.klasevich.spring.model.Employee;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface EmployeeToEmployeeResponseDtoMapper extends Converter<Employee, EmployeeResponseDto> {

    @Override
    EmployeeResponseDto convert(Employee employee);
}
