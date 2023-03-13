package com.internship.prime.controllers;

import com.internship.prime.domain.dtos.employeeDtos.EmployeeRequestDto;
import com.internship.prime.domain.dtos.employeeDtos.EmployeeResponseDto;
import com.internship.prime.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping()
    public ResponseEntity<List<EmployeeResponseDto>> findAllEmployees() {
        return ResponseEntity.ok(employeeService.findAllEmployees());
    }

    @GetMapping("/{employeeID}")
    public ResponseEntity<EmployeeResponseDto> findEmployee(@PathVariable Long employeeID) {
        return ResponseEntity.ok(employeeService.findEmployee(employeeID));
    }

    @PostMapping()
    public ResponseEntity<EmployeeResponseDto> createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employeeRequestDto));
    }

    @PutMapping("/{employeeID}")
    public ResponseEntity<EmployeeResponseDto> updateEmployee(@PathVariable Long employeeID,
                                                              @RequestBody EmployeeRequestDto employeeRequestDto) {
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(employeeService.updateEmployee(employeeID, employeeRequestDto));
    }

    @DeleteMapping("/{employeeID}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long employeeID) {
        employeeService.deleteEmployee(employeeID);
        return ResponseEntity.ok(HttpStatus.OK.name());
    }

}
