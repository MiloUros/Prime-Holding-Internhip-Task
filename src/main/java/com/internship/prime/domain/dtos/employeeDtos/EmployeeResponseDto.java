package com.internship.prime.domain.dtos.employeeDtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeResponseDto {

    private String fullName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private int completedTasks;

}
