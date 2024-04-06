package com.example.shareit.item;

import com.example.shareit.user.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ItemDTOtoItemMapper {
    public Item convert(ItemDTO itemDTO, User user) {
        return new Item(
                itemDTO.id(),
                user,
                itemDTO.name(),
                itemDTO.description(),
                itemDTO.status()
        );
    }
}
