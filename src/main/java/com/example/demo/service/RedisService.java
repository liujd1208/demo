package com.example.demo.service;

import com.example.demo.entrty.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public interface RedisService {

    /**
     * 根据ID查询一个Person对象
     * @param id
     * @return
     */
    @Cacheable(value="User", key="'User'+#id")
    User getUser(String id);

    /**
     * 根据ID删除一个Person对象
     * @param id
     * @return
     */
    @CacheEvict(value="User", key="'User'+#id",condition="#id!=1")
    String delete(String id);

    /**
     * 保存一个Person对象
     * @param User
     * @return
     */
    String save(User User);

}
