package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: 测试类
 * @author: Mr.Ljd
 * TODO
 * @create: 2019-04-08 17:08
 * version: 1.0
 */
@RestController  //@RestController=@Controller+@ResponseBody
@RequestMapping("com/pass/demo")
public class HelloController {

    /**
     * 测试本次项目搭建是否成功
     * @return
     */
    @RequestMapping("hello")
    public String say(){
        return "hello world";
    }
}