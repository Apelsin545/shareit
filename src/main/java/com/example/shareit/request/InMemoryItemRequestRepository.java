package com.example.shareit.request;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryItemRequestRepository implements ItemRequestRepository {
    private final Map<Long, ItemRequest> itemRequests = new HashMap<>();

    @Override
    public List<ItemRequest> findAll() {
        return itemRequests.values().stream().toList();
    }

    @Override
    public ItemRequest getRequestById(long id) {
        return itemRequests.get(id);
    }
}
