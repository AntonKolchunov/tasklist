package ru.anton.tasklist.service;

import ru.anton.tasklist.domain.user.User;

public interface UserService {

    User getById(Long id);

    User getByUserName(String username);

    User update(User user);

    User create(User user);

    boolean isTaskOwner(Long userId, Long taskId);

    void delete(Long id);
}
