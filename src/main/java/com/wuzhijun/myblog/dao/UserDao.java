package com.wuzhijun.myblog.dao;

import com.wuzhijun.myblog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;


import java.util.List;

@Mapper
public interface UserDao {
    public List<User> findAllUser();
}
