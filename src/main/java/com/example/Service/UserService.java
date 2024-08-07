package com.example.Service;

import com.example.model.User;

import java.util.List;

public interface UserService {

    boolean addUser(User user);

    User getUserByName(String name);
    List<User> getUsers();
    void updateUser(String username, String password);
    void deleteUser(String name);
}
