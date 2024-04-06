package com.example.shareit.item;

public record ItemDTO(
        int id,
        String name,
        String description,
        AccessStatus status
) {
}
