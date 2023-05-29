package ru.anton.tasklist.web.dto.auth;

import lombok.Data;

@Data
public class JwtResponse {
    private Long id;
    private String username;
    //создаем 2 токена, что пользователь залогинился
    //каждый запрос пользователя подписывается токеном
    //В случае когда время жизни accessToken подходит к концу, пользуемся refreshToken, для получения
    //новой пары токенов
    private String accessToken; //живёт мало (10-20 минут)
    private String refreshToken; // живёт (1-30 дней)
}
