package com.internship.prime.domain.mappers;

import com.internship.prime.domain.dtos.taskDtos.TaskRequestDto;
import com.internship.prime.domain.dtos.taskDtos.TaskResponseDto;
import com.internship.prime.domain.entities.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class TaskMapper {

    @Mapping(target = "id", ignore = true)
    public abstract Task taskRequestDtoToEntity(TaskRequestDto taskRequestDto);

    public void updateTaskFromRequest(Task task, TaskRequestDto taskRequestDto) {
        if (taskRequestDto == null) {
            return;
        }

        if (isNotEmpty(taskRequestDto.getDescription())) {
            task.setDescription(taskRequestDto.getDescription());
        }

        if (isNotEmpty(taskRequestDto.getTitle())) {
            task.setTitle(taskRequestDto.getTitle());
        }

        if (taskRequestDto.getDueDate() != null) {
            task.setDueDate(taskRequestDto.getDueDate());
        }

        if (taskRequestDto.getAssignee() != null) {
            task.setAssignee(taskRequestDto.getAssignee());
        }

    }

    public abstract TaskResponseDto taskToDto(Task task);

    private boolean isNotEmpty(String value) {
        return value != null && !value.isEmpty();
    }
}
