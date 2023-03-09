package java.com.PrimeHolding.domain.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Employee {

    private String fullName;
    private String email;
    private String phoneNumber;
    private LocalDateTime dateOfBirth;
    private double salary;
}
