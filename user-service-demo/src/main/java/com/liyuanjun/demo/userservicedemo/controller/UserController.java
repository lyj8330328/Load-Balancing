package com.liyuanjun.demo.userservicedemo.controller;

import com.liyuanjun.demo.userservicedemo.mapper.UserMapper;
import com.liyuanjun.demo.userservicedemo.pojo.User;
import com.liyuanjun.demo.userservicedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: 98050
 * Time: 2018-07-31 10:02
 * Feature:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getOne(@PathVariable("id") Integer id){
        return userService.queryById(id);
    }

}
