package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entrty.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: demo
 * @description: service实现类
 * @author: Mr.Ljd
 * <p>
 * TODO
 * @create: 2019-04-08 18:50
 * <p>
 * version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
        List<User> users = userDao.getAll();
        return users;
    }

    @Override
    public User getUser(String name) {
        User user = null;
        if(name != null && !"".equals(name)){
            user = userDao.getUser(name);
        }
        return user;
    }

    @Override
    public void add(User user) {
        userDao.insert(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }
}