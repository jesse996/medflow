package com.example.medflow.controller;

import com.example.medflow.repository.mapper.UserMapper;
import com.example.medflow.repository.po.UserPO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @GetMapping("")
    public List<UserPO> getUser(){
        return userMapper.selectList(null);
    }
}
