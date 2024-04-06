package com.example.shareit.request;

import com.example.shareit.user.User;
import lombok.Data;

@Data
public class ItemRequest {
    private long id;
    private User user;
    private String name;
}
