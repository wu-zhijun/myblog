package com.wuzhijun.myblog.serviceImpl;

import com.wuzhijun.myblog.dao.UserDao;
import com.wuzhijun.myblog.entity.User;
import com.wuzhijun.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser(){
        return userDao.findAllUser();
    }
}
