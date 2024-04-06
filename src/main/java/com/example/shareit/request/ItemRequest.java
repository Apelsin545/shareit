package com.example.shareit.request;

import com.example.shareit.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemRequest {
    private User user;
    private String itemName;
}
