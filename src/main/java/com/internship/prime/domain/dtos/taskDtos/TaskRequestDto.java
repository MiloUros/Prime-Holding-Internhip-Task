package com.internship.prime.domain.dtos.taskDtos;

import com.internship.prime.domain.entities.Employee;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskRequestDto {

    private String title;
    private String description;
    private LocalDateTime dueDate;
    private Employee assignee;

}
