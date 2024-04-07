package com.example.shareit.item;

public record ItemDTO(
        long id,
        String name,
        String description,
        AccessStatus status
) {
}
