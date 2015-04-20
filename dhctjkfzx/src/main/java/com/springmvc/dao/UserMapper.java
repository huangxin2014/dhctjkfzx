package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    // ²éÑ¯ËùÓÐ
    List<User> getAll();
    
    User isExistUser(String uname,String pword);
}