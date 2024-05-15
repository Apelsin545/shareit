package com.example.shareit.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository users;
    private final UserDTOMapper mapper;

    @Autowired
    public UserService(UserRepository users, UserDTOMapper mapper) {
        this.users = users;
        this.mapper = mapper;
    }


    public List<UserDTO> getAllUsers() {
        return users
                .findAll()
                .stream()
                .map(mapper)
                .toList();
    }

    public UserDTO findUserById(long id) {
        return mapper.apply(users.getUserById(id));
    }

    public User addUser(User user) {
        return users.add(user);
    }
}
