package com.example.Service;

import com.example.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User getUserByName(String name);
    List<User> getUsers();
    void updateUser(String name, String password);
    void deleteUser(String name);
}
