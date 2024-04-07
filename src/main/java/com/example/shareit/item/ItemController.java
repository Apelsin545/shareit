package com.example.shareit.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/{itemId}")
    public ItemDTO getItemById(@PathVariable long itemId) {
        return itemService.getItemById(itemId);
    }

    @GetMapping("")
    public List<ItemDTO> getOwnersItems(@RequestHeader("X-Sharer-User_Id") long userId) {
        return itemService.getOwnersItems(userId);
    }

    @GetMapping("/search")
    public List<ItemDTO> searchItem(@RequestParam String text, @RequestHeader("X-Sharer-User_Id") long userId) {
        return itemService.searchItem(text, userId);
    }

    @PostMapping("")
    public ItemDTO addItem(@RequestBody ItemDTO item, @RequestHeader("X-Sharer-User_Id") long userId) {
        return itemService.addItem(item, userId);
    }
}
