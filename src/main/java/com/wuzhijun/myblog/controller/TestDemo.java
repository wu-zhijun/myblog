package com.wuzhijun.myblog.controller;

import com.wuzhijun.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wuzhijun.myblog.entity.User;

import java.util.List;

@Controller
public class TestDemo {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/")
    public  String get(){
        return  "hello world";
    }

    @RequestMapping("/login")
    public String login(){
        return "adminlogin";
    }

    @RequestMapping("/back")
    public String back(){
        return  "backstage";
    }


    @ResponseBody
    @RequestMapping("/getUser")
    public List<User> getUsers(){
        return userService.findAllUser();
    }

}
