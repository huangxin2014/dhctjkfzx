package com.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserMapper;
import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userMapper.getAll();
	}

	public Boolean checkLogin(String email, String pword) {
		// TODO Auto-generated method stub
		Boolean flag = false;
		
		User user = userMapper.isExistUser(email,pword);
		if (user != null) {
			System.out.println(user);
			flag = true;
		}
		return flag;
	}

	public int findId(String email, String pword) {
		User user = userMapper.isExistUser(email,pword);
		
		return user.getUserid();
	}
	
	
	
}