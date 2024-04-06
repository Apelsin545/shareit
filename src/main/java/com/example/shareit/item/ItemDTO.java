package com.example.shareit.item;

public record ItemDTO(
        String name,
        String description,
        AccessStatus status
) {
}
