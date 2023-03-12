package com.internship.prime.controllers;

import com.internship.prime.domain.dtos.taskDtos.TaskRequestDto;
import com.internship.prime.domain.dtos.taskDtos.TaskResponseDto;
import com.internship.prime.services.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/task")
public class TaskController {

    private TaskService taskService;

    @GetMapping()
    public ResponseEntity<List<TaskResponseDto>> findAllTasks() {

        return ResponseEntity.ok(taskService.findAll());

    }

    @GetMapping("/{taskID}")
    public ResponseEntity<TaskResponseDto> findTask(@PathVariable Long taskID) {

        return ResponseEntity.ok(taskService.findTask(taskID));

    }

    @PostMapping()
    public ResponseEntity<TaskResponseDto> createTask(@RequestBody TaskRequestDto taskRequestDto) {

        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.createTask(taskRequestDto));

    }

    @PutMapping("{/taskID}")
    public ResponseEntity<TaskResponseDto> updateTask(@PathVariable Long taskID,
                                                      @RequestBody TaskRequestDto taskRequestDto) {

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(taskService.updateTask(taskID, taskRequestDto));

    }

    @DeleteMapping("{taskID}")
    public ResponseEntity<String> deleteTask(@PathVariable Long taskID) {

        taskService.deleteTask(taskID);
        return ResponseEntity.ok(HttpStatus.OK.name());

    }
}
