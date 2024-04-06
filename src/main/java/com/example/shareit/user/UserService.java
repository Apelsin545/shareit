package com.example.shareit.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository users;

    @Autowired
    public UserService(UserRepository users) {
        this.users = users;
    }

    public List<User> getAllUsers() {
        return users.findAll();
    }

    public User findUserById(long id) {
        return users.getUserById(id);
    }

    public User addUser(User user) {
        return users.add(user);
    }
}
