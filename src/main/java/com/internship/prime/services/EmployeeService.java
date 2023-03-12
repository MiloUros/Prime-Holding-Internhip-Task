package com.internship.prime.services;

import com.internship.prime.CommonErrorMessages;
import com.internship.prime.domain.dtos.employeeDtos.EmployeeRequestDto;
import com.internship.prime.domain.dtos.employeeDtos.EmployeeResponseDto;
import com.internship.prime.domain.entities.Employee;
import com.internship.prime.domain.mappers.EmployeeMapper;
import com.internship.prime.exceptions.EmployeeNotFoundException;
import com.internship.prime.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeResponseDto findEmployee(Long id) {

        var employee = findEmployeeById(id);
        return employeeMapper.employeeToDto(employee);

    }

    public List<EmployeeResponseDto> findAllEmployees() {

        return employeeRepository.findAll().stream().map(employeeMapper::employeeToDto).toList();

    }

    public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto) {

        var employee = employeeMapper.employeeRequestDtoToEntity(employeeRequestDto);
        employeeRepository.save(employee);
        return employeeMapper.employeeToDto(employee);

    }

    public EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto employeeRequestDto) {

        var employee = findEmployeeById(id);
        employeeMapper.updateEntityFromRequest(employee, employeeRequestDto);
        return employeeMapper.employeeToDto(employee);

    }

    public void deleteEmployee(Long id) {

        var employee = findEmployeeById(id);
        employeeRepository.delete(employee);

    }

    private Employee findEmployeeById(Long id) {

        return employeeRepository.findEmployeeById(id).orElseThrow(()
                -> new EmployeeNotFoundException(CommonErrorMessages.INVALID_EMPLOYEE_ID));

    }

}
