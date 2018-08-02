package com.liyuanjun.demo.userservicedemo.service.UserServiceImpl;

import com.liyuanjun.demo.userservicedemo.mapper.UserMapper;
import com.liyuanjun.demo.userservicedemo.pojo.User;
import com.liyuanjun.demo.userservicedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Author: 98050
 * Time: 2018-07-31 10:01
 * Feature:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Integer id) throws InterruptedException{
        Thread.sleep(new Random().nextInt(2000));
        return userMapper.selectByPrimaryKey(id);
    }



}
