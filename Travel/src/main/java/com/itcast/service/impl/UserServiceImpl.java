package com.itcast.service.impl;

import com.itcast.entity.User;
import com.itcast.mapper.UserMapper;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
