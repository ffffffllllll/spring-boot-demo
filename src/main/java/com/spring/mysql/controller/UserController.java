package com.spring.mysql.controller;

import com.spring.mysql.domin.User;
import com.spring.mysql.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：Fangle
 * @className:UserController
 * @description:
 * @date:3:02 PM 2019/3/13
 */

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("user/{id}")
    public User byId(@PathVariable("id") Integer id) {
        return userMapper.byId(id);
    }

}
