package com.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {
	
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping("{id}/showUser")
	public String showUser(@PathVariable int id,HttpServletRequest request){
		User u = userService.getUserById(id);
		
		request.setAttribute("user", u);
		return "showUser";
	}

	@RequestMapping("login")
	public String login(User user,HttpServletRequest request) {
		
		Boolean flag =  userService.checkLogin(user.getEmail(), user.getPassword());
		
		if (user.getEmail() == "" || user.getPassword() == "" ) {
			request.setAttribute("errorinfo", "” œ‰ªÚ√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î");
			
			return "index";
		}
		
		if (flag == true) {
			int userId = userService.findId(user.getEmail(), user.getPassword());
			User u = userService.getUserById(userId); 
			request.setAttribute("USER", u);
			return "homePage";
		}else{
			request.setAttribute("errorinfo", "” œ‰ªÚ√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î");
			return "index";
		}
		
	}
}
