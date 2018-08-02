package com.example.consumerdemo.service;

import com.example.consumerdemo.dao.UserClient;
import com.example.consumerdemo.dao.UserDao;
import com.example.consumerdemo.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: 98050
 * Time: 2018-07-31 13:53
 * Feature:
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserClient userClient;

    public List<User> queryUserByIds(List<Integer> ids) {
        List<User> users = new ArrayList<>();
        for (Integer id : ids) {
            User user = this.userDao.queryUserById(id);
            //User user = this.userClient.getOne(id);
            users.add(user);
        }
        return users;
    }
}
