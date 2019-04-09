package com.example.demo.service;

import com.example.demo.entrty.User;

import java.util.List;

public interface UserService {


    List<User> getAllUser();

    User getUser(String name);

    void add(User user);

    void update(User user);

    void delete(String id);
}
