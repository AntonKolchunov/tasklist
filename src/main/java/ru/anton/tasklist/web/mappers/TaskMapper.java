package ru.anton.tasklist.web.mappers;

import org.mapstruct.Mapper;
import ru.anton.tasklist.domain.task.Task;
import ru.anton.tasklist.web.dto.task.TaskDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto dto);
}
