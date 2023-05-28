package ru.anton.tasklist.web.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import ru.anton.tasklist.domain.task.Task;
import ru.anton.tasklist.domain.user.Role;
import ru.anton.tasklist.web.dto.validation.OnCreate;
import ru.anton.tasklist.web.dto.validation.OnUpdate;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {
    @NotNull(message = "Id must be not null.", groups = OnUpdate.class)
    //При создании id ещё не известен, используем аннотацию только для обновления
    private Long id;

    @NotNull(message = "Name must be not null.", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Name length must be smaller than 255 symbols.",
            groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @NotNull(message = "Username must be not null.", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Username length must be smaller than 255 symbols.",
            groups = {OnCreate.class, OnUpdate.class})
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    //Можем только принимать пароль, с сервера назад не отправляем
    @NotNull(message = "Password must be not null.", groups = {OnCreate.class, OnUpdate.class})
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password confirmation must be not null.", groups = OnCreate.class)
    private String passwordConfirmation;
}
