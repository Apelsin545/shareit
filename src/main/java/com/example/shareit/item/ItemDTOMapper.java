package com.example.shareit.item;

import java.util.function.Function;

public class ItemDTOMapper implements Function<Item, ItemDTO> {

    @Override
    public ItemDTO apply(Item item) {
        return new ItemDTO(
                item.getName(),
                item.getDescription(),
                item.getStatus()
        );
    }
}
