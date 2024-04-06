package com.example.shareit.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private final long id;
    private String name;
    private String login;
    private String password;
}
