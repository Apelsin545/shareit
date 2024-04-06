package com.example.shareit.request;

import java.util.Collection;
import java.util.List;

public interface ItemRequestRepository {
    List<ItemRequest> findAll();
    ItemRequest getRequestById(long id);
}
