package com.example.consumerdemo.dao;

import com.example.consumerdemo.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {
    @Override
    public User getOne(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("Feign用户查询出现异常！");
        return user;
    }
}