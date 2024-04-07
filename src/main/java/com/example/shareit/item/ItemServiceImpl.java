package com.example.shareit.item;

import com.example.shareit.user.UserRepository;
import com.example.shareit.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository items;
    private final UserRepository users;
    private final ItemDTOMapper mapperTo;
    private final ItemDTOtoItemMapper mapperFrom;


    @Autowired
    public ItemServiceImpl(ItemRepository items, UserRepository users, ItemDTOMapper mapperTo, ItemDTOtoItemMapper mapperFrom) {
        this.items = items;
        this.users = users;
        this.mapperTo = mapperTo;
        this.mapperFrom = mapperFrom;
    }

    @Override
    public ItemDTO addItem(ItemDTO item, long userId) {
        return mapperTo.apply(items.add(mapperFrom.convert(item, users.getUserById(userId))));
    }

    @Override
    public ItemDTO changeItem(ItemDTO item, long userId) {
        return mapperTo.apply(items.add(mapperFrom.convert(item, users.getUserById(userId))));
    }

    @Override
    public ItemDTO getItemById(long itemId) {
        return mapperTo.apply(items.getItemById(itemId));
    }

    @Override
    public List<ItemDTO> getOwnersItems(long userId) {
        return items.findAll()
                .stream()
                .filter(a -> a.getOwner().getId() == userId)
                .map(mapperTo)
                .toList();
    }

    @Override
    public List<ItemDTO> searchItem(String text, long userId) {
        return items.findAll()
                .stream()
                .filter(a -> ((a.getName().contains(text) || a.getDescription().contains(text))
                        && a.getOwner().getId() != userId))
                .map(mapperTo)
                .toList();
    }
}
