package com.example.shareit.user;

import java.util.Collection;
import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User getUserById(long id);
}
