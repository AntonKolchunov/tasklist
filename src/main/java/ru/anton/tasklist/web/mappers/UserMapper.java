package ru.anton.tasklist.web.mappers;

import org.mapstruct.Mapper;
import ru.anton.tasklist.domain.user.User;
import ru.anton.tasklist.web.dto.user.UserDto;

@Mapper(componentModel = "spring")
//создастя компонент этого маппера и мы сможем вызывать его через autowired
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);
}
