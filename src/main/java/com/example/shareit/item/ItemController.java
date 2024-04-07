package com.example.shareit.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items/{itemId}")
    public ItemDTO getItemById(@PathVariable long itemId) {
        return itemService.getItemById(itemId);
    }

    @GetMapping("items")
    public List<ItemDTO> getOwnersItems(@RequestHeader("X-Sharer-User_Id") long userId) {
        return itemService.getOwnersItems(userId);
    }
}
