package com.example.dao;

import com.example.model.User;

import java.util.List;

public interface UserDAO {

    boolean addUser(User user);
    User getUserByName(String name);
    List<User> getUsers();
    void updateUser(String username, String password);
    void deleteUser(User user);
}
