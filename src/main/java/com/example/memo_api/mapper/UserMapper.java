package com.example.memo_api.mapper;


import com.example.memo_api.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT user_id,username,password,created_at FROM users WHERE username = #{username}")
    User selectUserByUsername(String username);
}
