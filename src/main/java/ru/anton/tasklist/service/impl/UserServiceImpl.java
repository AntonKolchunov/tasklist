package ru.anton.tasklist.service.impl;

import org.springframework.stereotype.Service;
import ru.anton.tasklist.domain.user.User;
import ru.anton.tasklist.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getByUserName(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
