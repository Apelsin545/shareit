package com.example.shareit.item;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryItemRepository implements ItemRepository {
    private final Map<Long, Item> items = new HashMap<>();

    @Override
    public List<Item> findAll() {
        return items.values().stream().toList();
    }

    @Override
    public Item getItemById(long id) {
        return items.get(id);
    }
}
