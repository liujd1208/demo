package com.example.demo.service.impl;

import com.example.demo.entrty.User;
import com.example.demo.service.RedisService;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description: xxx
 * @author: xxx
 * <p>
 * TODO
 * @create: 2019-04-08 20:20
 * <p>
 * version: 1.0
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Override
    public User getUser(String id) {
        System.out.println(id+"进入实现类");
        User User =
                new User(id, "redis", 23, "boy");
        return User;
    }

    @Override
    public String delete(String id) {
        System.out.println(id+"进入实现类删除数据");
        return "message";
    }

    @Override
    public String save(User User) {
        return null;
    }
}