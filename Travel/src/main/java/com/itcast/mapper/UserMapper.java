package com.itcast.mapper;

import com.itcast.entity.User;

import java.util.List;

public interface UserMapper
{
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
}
