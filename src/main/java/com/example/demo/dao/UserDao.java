package com.example.demo.dao;

import com.example.demo.entrty.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @Description: java类作用描述
 * @Author: xxx
 * @Date: 2019/4/8 18:30
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 *
 */
@Repository
public interface UserDao {

    /**
     * 查询出表中所有的人员
     * @return
     */
    @Select("select * from user ")
    List<User> getAll();

    /**
     * 根据姓名查找
     * @param name
     * @return
     */
    @Select("select * from user where name = #{name} limit 5")
    User getUser(String name);

    /**
     * 添加一条数据
     * @param user
     */
    @Insert("insert into user values(#{id},#{name},#{age},#{sex}) ")
    void insert(User user);

    /**
     * 根据ID去更新
     * @param user
     */
    @Update("update user set name = #{name},age = #{age}, sex = #{sex} where id = #{id}")
    void update(User user);

    /**
     * 根据ID去删除一条信息
     * @param id
     */
    @Delete("delete from user where id = #{id}")
    void delete(String id);
}
