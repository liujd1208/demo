package com.example.demo.controller;

        import com.example.demo.entrty.User;
        import com.example.demo.service.RedisService;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;

        import javax.annotation.Resource;

/**
 * @program: demo
 * @description:
 * @author: xxxx
 * <p>
 * TODO
 * @create: 2019-04-08 20:16
 * <p>
 * version: 1.0
 */
@RestController
@RequestMapping("com/pass/test")
public class UserRedisController {

    @Resource
    private RedisService redisService;

    @RequestMapping(value = "/redis", method = RequestMethod.GET)
    public User getUser(){
        User User = redisService.getUser("00001");
        return User;
    }

    @RequestMapping(value = "/redis", method = RequestMethod.DELETE)
    public String deletePerson(){
        redisService.delete("00001");
        return "执行了删除";
    }

}