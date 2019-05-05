package com.springboot.dao;

import com.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/5/5 16:34
 * @Description:
 */
@Mapper
@Repository("userMapper")
public interface UserMapper {
    List<User> queryAll();
}
