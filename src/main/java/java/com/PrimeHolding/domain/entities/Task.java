package java.com.PrimeHolding.domain.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Task {

    private String title;
    private String description;
    private Employee assignee;
    private LocalDateTime dueDate;
}
