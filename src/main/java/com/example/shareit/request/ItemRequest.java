package com.example.shareit.request;

import lombok.Data;

@Data
public class ItemRequest {
    private long id;
    private long userId;
    private String name;
}
