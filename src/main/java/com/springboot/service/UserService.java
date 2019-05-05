package com.springboot.service;

import com.springboot.entity.User;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/5/5 16:33
 * @Description:
 */
public interface UserService {
    List<User> queryAll();
}
