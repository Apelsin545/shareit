package com.example.shareit.item;

import java.util.Collection;
import java.util.List;

public interface ItemRepository {
    List<Item> findAll();
    Item getItemById(long id);

    Item add(Item item);
}
