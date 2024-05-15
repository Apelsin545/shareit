package com.example.shareit.item;

import com.example.shareit.user.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ItemDTOMapper {

    public ItemDTO toDto(Item item) {
        return new ItemDTO(
                item.getId(),
                item.getName(),
                item.getDescription(),
                item.getStatus()
        );
    }

    public Item fromDto(ItemDTO itemDTO, User user) {
        return new Item(
                user.getId(),
                user,
                itemDTO.name(),
                itemDTO.description(),
                itemDTO.status()
        );
    }
}
