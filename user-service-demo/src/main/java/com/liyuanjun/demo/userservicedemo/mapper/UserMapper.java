package com.liyuanjun.demo.userservicedemo.mapper;

import com.liyuanjun.demo.userservicedemo.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


/**
 * Author: 98050
 * Time: 2018-07-30 22:33
 * Feature:
 */
@org.apache.ibatis.annotations.Mapper
@Repository
public interface UserMapper extends Mapper<User> {

}
