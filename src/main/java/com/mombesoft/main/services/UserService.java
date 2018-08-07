package com.mombesoft.main.services;

import com.mombesoft.main.entities.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
