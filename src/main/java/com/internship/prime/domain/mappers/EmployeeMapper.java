package com.internship.prime.domain.mappers;

import com.internship.prime.domain.dtos.employeeDtos.EmployeeRequestDto;
import com.internship.prime.domain.dtos.employeeDtos.EmployeeResponseDto;
import com.internship.prime.domain.entities.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class EmployeeMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "task", ignore = true)
    @Mapping(target = "completedTasks", ignore = true)
    public abstract Employee employeeRequestDtoToEntity(EmployeeRequestDto employeeRequestDto);

    public void updateEntityFromRequest(Employee employee, EmployeeRequestDto employeeRequestDto) {

        if (employeeRequestDto == null) {
            return;
        }

        if (isNotEmpty(employeeRequestDto.getFullName())) {
            employee.setFullName(employeeRequestDto.getFullName());
        }

        if (isNotEmpty(employeeRequestDto.getEmail())) {
            employee.setEmail(employeeRequestDto.getEmail());
        }

        if (isNotEmpty(employeeRequestDto.getPhoneNumber())) {
            employee.setPhoneNumber(employeeRequestDto.getPhoneNumber());
        }

        if (employeeRequestDto.getDateOfBirth() != null) {
            employee.setDateOfBirth(employeeRequestDto.getDateOfBirth());
        }

        if (employeeRequestDto.getSalary() != 0) {
            employee.setSalary(employeeRequestDto.getSalary());
        }

    }

    public abstract EmployeeResponseDto employeeToDto(Employee employee);

    private boolean isNotEmpty(String value) {
        return value != null && !value.isEmpty();
    }
}
