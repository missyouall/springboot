package com.springboot.controller;

import com.springboot.entity.User;
import com.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/5/5 16:34
 * @Description:
 */
@Controller
@RequestMapping("/userC")
public class UserController {
    final static Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService service;
    @RequestMapping("/queryAll")
    @ResponseBody
    public String queryAll(){
        List<User> queryList = service.queryAll();
        for(User user:queryList){
            log.info("user.name--->{}",user.getUserName());
        }
        return queryList.get(0).getUserName();
    };
}
