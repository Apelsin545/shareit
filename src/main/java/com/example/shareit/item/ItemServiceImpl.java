package com.example.shareit.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository items;

    @Autowired
    public ItemServiceImpl(ItemRepository items) {
        this.items = items;
    }

    @Override
    public Item addItem(Item item) {
        return items.add(item);
    }

    @Override
    public Item changeItem(Item item) {
        return items.add(item);
    }

    @Override
    public Item getItemById(long itemId) {
        return items.getItemById(itemId);
    }

    @Override
    public List<Item> getOwnersItems(long userId) {
        return items.findAll()
                .stream()
                .filter(a -> a.getOwner().getId() == userId)
                .toList();
    }

    @Override
    public List<Item> searchItem(String text, long userId) {
        return items.findAll()
                .stream()
                .filter(a -> ((a.getName().contains(text) || a.getDescription().contains(text))
                        && a.getOwner().getId() != userId))
                .toList();
    }
}
