package com.example.shareit.item;

import com.example.shareit.user.UserRepository;
import com.example.shareit.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService {
    private final ItemRepository items;
    private final UserRepository users;
    private final ItemDTOMapper itemMapper;

    @Autowired
    public ItemServiceImpl(ItemRepository items, UserRepository users, ItemDTOMapper itemMapper) {
        this.items = items;
        this.users = users;
        this.itemMapper = itemMapper;
    }

    @Override
    public ItemDTO addItem(ItemDTO item, long userId) {
        items.save(itemMapper.fromDto(item, users.getReferenceById(userId)));

        return itemMapper.toDto(items.getReferenceById(item.id()));
    }

    @Override
    public ItemDTO changeItem(ItemDTO item, long userId) {
        items.save(itemMapper.fromDto(item, users.getReferenceById(userId)));

        return itemMapper.toDto(items.getReferenceById(item.id()));
    }

    @Override
    public ItemDTO getItemById(long itemId) {
        return itemMapper.toDto(items.getReferenceById(itemId));
    }

    @Override
    public List<ItemDTO> getOwnersItems(long userId) {
        return items.findAll()
                .stream()
                .filter(a -> a.getOwner().getId() == userId)
                .map(item -> new ItemDTO(
                        item.getId(),
                        item.getName(),
                        item.getDescription(),
                        item.getStatus()
                ))
                .toList();
    }

    @Override
    public List<ItemDTO> searchItem(String text, long userId) {
        return items.findAll()
                .stream()
                .filter(a -> ((a.getName().contains(text) || a.getDescription().contains(text))
                        && a.getOwner().getId() != userId))
                .map(item -> new ItemDTO(
                        item.getId(),
                        item.getName(),
                        item.getDescription(),
                        item.getStatus()
                ))
                .toList();
    }
}
