package com.itcast.service;

import com.itcast.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
}
