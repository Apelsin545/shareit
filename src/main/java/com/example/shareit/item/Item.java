package com.example.shareit.item;

import com.example.shareit.user.User;
import lombok.Data;

@Data
public class Item {
    private final long id;
    private User owner;
    private String name;
    private String description;

    private AccessStatus status;
}
