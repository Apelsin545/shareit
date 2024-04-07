package com.example.shareit.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    private final ItemService itemService;
    private final ItemDTOMapper mapper;

    @Autowired
    public ItemController(ItemService itemService, ItemDTOMapper mapper) {
        this.itemService = itemService;
        this.mapper = mapper;
    }

    @GetMapping("/items/{itemId}")
    public ItemDTO getItemById(@PathVariable long itemId) {
        return mapper.apply(itemService.getItemById(itemId));
    }
}
