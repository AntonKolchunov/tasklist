package ru.anton.tasklist.web.dto.task;

import lombok.Data;
import ru.anton.tasklist.domain.task.Status;

import java.time.LocalDateTime;
@Data
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime expirationDate;
}
