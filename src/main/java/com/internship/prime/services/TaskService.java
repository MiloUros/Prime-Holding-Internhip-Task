package com.internship.prime.services;

import com.internship.prime.CommonErrorMessages;
import com.internship.prime.domain.dtos.taskDtos.TaskRequestDto;
import com.internship.prime.domain.dtos.taskDtos.TaskResponseDto;
import com.internship.prime.domain.entities.Task;
import com.internship.prime.domain.mappers.TaskMapper;
import com.internship.prime.exceptions.TaskNotFoundException;
import com.internship.prime.repositories.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public List<TaskResponseDto> findAll() {

        var tasks = taskRepository.findAll();
        return tasks.stream().map(taskMapper::taskToDto).toList();

    }

    public TaskResponseDto findTask(Long id) {

        var task = findTaskById(id);
        return taskMapper.taskToDto(task);

    }

    public TaskResponseDto createTask(TaskRequestDto taskRequestDto) {

        var task = taskMapper.taskRequestDtoToEntity(taskRequestDto);
        taskRepository.save(task);
        return taskMapper.taskToDto(task);

    }

    public TaskResponseDto updateTask(Long id, TaskRequestDto taskRequestDto) {

        var task = findTaskById(id);
        taskMapper.updateTaskFromRequest(task, taskRequestDto);
        return taskMapper.taskToDto(task);

    }

    public void deleteTask(Long id) {

        var task = findTaskById(id);
        taskRepository.delete(task);

    }

    private Task findTaskById(Long id) {

        return taskRepository.findTaskById(id).orElseThrow(()
                -> new TaskNotFoundException(CommonErrorMessages.INVALID_TASK_GUID));

    }

}
