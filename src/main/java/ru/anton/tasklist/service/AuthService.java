package ru.anton.tasklist.service;

import ru.anton.tasklist.web.dto.auth.JwtRequest;
import ru.anton.tasklist.web.dto.auth.JwtResponse;

public interface AuthService {
    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);
}
