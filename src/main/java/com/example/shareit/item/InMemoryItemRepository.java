package com.example.shareit.item;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryItemRepository implements ItemRepository {
    private final Map<Long, Item> items = new HashMap<>();

    @Override
    public Collection<Item> findAll() {
        return items.values();
    }

    @Override
    public Item getItemById(long id) {
        return items.get(id);
    }
}
