package com.internship.prime.services;

import com.internship.prime.domain.dtos.employeeDtos.EmployeeResponseDto;
import com.internship.prime.domain.entities.Employee;
import com.internship.prime.domain.mappers.EmployeeMapper;
import com.internship.prime.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    public List<EmployeeResponseDto> mostTasksCompleted() {
        var employees = employeeRepository.findAll();
        employees.sort(Comparator.comparing(Employee::getCompletedTasks).reversed());
        List<Employee> mostTaskCompletedByEmployee = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            mostTaskCompletedByEmployee.add(employees.get(i));
        }
        return mostTaskCompletedByEmployee.stream().map(employeeMapper::employeeToDto).toList();
    }

}
