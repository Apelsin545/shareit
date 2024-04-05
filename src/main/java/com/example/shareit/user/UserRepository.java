package com.example.shareit.user;

import java.util.Collection;

public interface UserRepository {
    Collection<User> findAll();
    User getUserById(long id);
}
