package com.example.demo.controller;

import com.example.demo.entrty.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: demo
 * @description: 接口测试
 * @author: Mr.Ljd
 * <p>
 * TODO
 * @create: 2019-04-08 19:01
 * <p>
 * version: 1.0
 */
@RestController
@RequestMapping("com/pass/demo")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> getAll(){
        List<User> user = userService.getAllUser();
        return user;
    }

    @RequestMapping(value = "/userName", method = RequestMethod.GET)
    public User getUser(String name){

        User user = null;
        if(name != null & !"".equals(name)){
            user = userService.getUser(name);
        }
        return user;
    }

    @RequestMapping(value = "user", method = RequestMethod.POST)
    public String add(User user){
        String message;
        try{
            userService.add(user);
            message = "success";
        }catch(Exception e) {
            e.printStackTrace();
            message = "fail";
        }
        return message;
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String update(User user){
        String message;
        try{
            userService.update(user);
            message = "success";
        }catch(Exception e) {
            e.printStackTrace();
            message = "fail";
        }
        return message;
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public String delete(String id){
        String message;
        try{
            userService.delete(id);
            message = "success";
        }catch(Exception e) {
            e.printStackTrace();
            message = "fail";
        }
        return message;
    }
}