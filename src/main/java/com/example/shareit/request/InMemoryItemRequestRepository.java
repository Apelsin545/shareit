package com.example.shareit.request;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryItemRequestRepository implements ItemRequestRepository {
    private final Map<Long, ItemRequest> itemRequests = new HashMap<>();

    @Override
    public Collection<ItemRequest> findAll() {
        return itemRequests.values();
    }

    @Override
    public ItemRequest getRequestById(long id) {
        return itemRequests.get(id);
    }
}
