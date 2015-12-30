package com.springmvc.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.springmvc.model.User;
import com.springmvc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestDHC {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TestDHC.class);

	private UserService userService;
	
	
	/**
	 * 方法一：未结合SpringTest时的测试方式
	 */
	private ApplicationContext ac;
	@Before
	public void b() {
		ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		userService = (UserService) ac.getBean("userService");
	}
	
	/**
	 * 方法二：结合SpringTest时
	 */
	
	public UserService getUserService() {
		return userService;
	}
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	@Test
	public void test(){
		User u = userService.getUserById(1);
	//	System.out.println(u.getHometown());
	//	logger.info(u.getHometown());
		logger.info(JSON.toJSONString(u));
	}
	
	@Test
	public void test1(){
		List<User> list = userService.getAll();
		logger.info(JSON.toJSONString(list));
		System.out.println(2222);
	}
}
