package com.internship.prime.domain.dtos.employeeDtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeRequestDto {

    private String fullName;
    private String email;
    private String phoneNumber;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dateOfBirth;
    private double salary;

}
