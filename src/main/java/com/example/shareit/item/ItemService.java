package com.example.shareit.item;

import java.util.List;

public interface ItemService {
    ItemDTO addItem(ItemDTO item, long userId);

    ItemDTO changeItem(ItemDTO item, long userId);

    ItemDTO getItemById(long itemId);

    List<ItemDTO> getOwnersItems(long userId);

    List<ItemDTO> searchItem(String text, long userId);
}
