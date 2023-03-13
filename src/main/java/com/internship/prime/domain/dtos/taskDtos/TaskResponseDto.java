package com.internship.prime.domain.dtos.taskDtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskResponseDto {

    private String title;
    private String description;
    private LocalDate dueDate;

}
