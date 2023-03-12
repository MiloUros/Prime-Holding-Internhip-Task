package com.internship.prime.domain.dtos.employeeDtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeResponseDto {

    private String fullName;
    private String email;
    private String phoneNumber;
    private LocalDateTime dateOfBirth;

}
