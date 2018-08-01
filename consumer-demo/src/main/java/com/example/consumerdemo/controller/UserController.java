package com.example.consumerdemo.controller;

import com.example.consumerdemo.pojo.User;
import com.example.consumerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: 98050
 * Time: 2018-07-31 13:57
 * Feature:
 */
@RestController
@RequestMapping("hello")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public List<User> queryUsers(@RequestParam("ids") List<Integer> ids) {
        return userService.queryUserByIds(ids);
    }
}
