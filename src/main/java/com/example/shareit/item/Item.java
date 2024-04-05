package com.example.shareit.item;

import lombok.Data;

@Data
public class Item {
    private long id;
    private long ownerId;
    private String name;
    private String description;

    private accessStatus status;

    private enum accessStatus {
        AVAILABLE,
        NOT_AVAILABLE
    }
}
