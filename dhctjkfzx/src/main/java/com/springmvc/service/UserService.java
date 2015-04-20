package com.springmvc.service;

import java.util.List;

import com.springmvc.model.User;

public interface UserService {

	public User getUserById(int id);
	
	public List<User> getAll();
	
	public Boolean checkLogin(String email,String pword);
	
	public int findId(String email,String pword);
}
