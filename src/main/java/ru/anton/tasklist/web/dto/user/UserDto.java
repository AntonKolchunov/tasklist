package ru.anton.tasklist.web.dto.user;

import lombok.Data;
import ru.anton.tasklist.domain.task.Task;
import ru.anton.tasklist.domain.user.Role;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;
}
