package com.internship.prime.domain.dtos.taskDtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskRequestDto {

    private String title;
    private String description;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dueDate;

}
