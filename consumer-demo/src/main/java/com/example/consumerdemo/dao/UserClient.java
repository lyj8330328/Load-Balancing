package com.example.consumerdemo.dao;

import com.example.consumerdemo.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: 98050
 * Time: 2018-08-01 19:38
 * Feature:
 */
@FeignClient(value = "user-service", path = "user", fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("/{id}")
    User getOne(@PathVariable("id") Integer id);
}
