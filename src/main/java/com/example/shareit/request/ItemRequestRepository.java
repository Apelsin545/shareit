package com.example.shareit.request;

import java.util.Collection;

public interface ItemRequestRepository {
    Collection<ItemRequest> findAll();
    ItemRequest getRequestById(long id);
}
