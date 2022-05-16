package com.klasevich.spring.mapper;

import com.klasevich.spring.controller.dto.EmployeeRequestDto;
import com.klasevich.spring.model.Employee;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface EmployeeRequestDtoToEmployeeMapper extends Converter<EmployeeRequestDto, Employee> {

    @Override
    Employee convert(EmployeeRequestDto employeeRequestDto);
}
