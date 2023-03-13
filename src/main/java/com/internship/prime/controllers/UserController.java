package com.internship.prime.controllers;

import com.internship.prime.domain.dtos.employeeDtos.EmployeeResponseDto;
import com.internship.prime.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<EmployeeResponseDto>> mostTasksCompletedByEmployees() {
        return ResponseEntity.ok(userService.mostTasksCompleted());
    }

}
