package com.example.shareit.item;

import java.util.Collection;

public interface ItemRepository {
    Collection<Item> findAll();
    Item getItemById(long id);
}
