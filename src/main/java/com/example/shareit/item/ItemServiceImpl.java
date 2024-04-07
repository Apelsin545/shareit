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
        return null;
    }

    @Override
    public Item changeItem(long itemId) {
        return null;
    }

    @Override
    public Item getItemById(long itemId) {
        return null;
    }

    @Override
    public List<Item> getOwnersItems(long userId) {
        return null;
    }

    @Override
    public List<Item> searchItem(String text, long userId) {
        return null;
    }
}
