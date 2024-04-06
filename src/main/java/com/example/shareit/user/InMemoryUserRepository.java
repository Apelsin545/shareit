package com.example.shareit.user;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<Long, User> users = new HashMap<>();

    @Override
    public List<User> findAll() {
        return users.values().stream().toList();
    }

    @Override
    public User getUserById(long id) {
        return users.get(id);
    }

    @Override
    public User add(User user) {
        return users.put(user.getId(), user);
    }
}
