package com.example.shareit.request;

import com.example.shareit.user.User;
import lombok.Data;

@Data
public class ItemRequest {
    private User user;
    private String name;
}
