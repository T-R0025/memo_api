package com.example.memo_api.repository;

import com.example.memo_api.dto.User;
import com.example.memo_api.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private final UserMapper userMapper;

    public UserRepository(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User selectUserByUsername(String username){
        return userMapper.selectUserByUsername(username);
    }
}
