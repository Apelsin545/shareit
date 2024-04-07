package com.example.shareit.item;

import java.util.List;

public interface ItemService {
    Item addItem(Item item);

    Item changeItem(Item item);

    Item getItemById(long itemId);

    List<Item> getOwnersItems(long userId);

    List<Item> searchItem(String text, long userId);
}
