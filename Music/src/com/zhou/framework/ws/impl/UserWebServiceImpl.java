package com.zhou.framework.ws.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import com.google.gson.Gson;
import com.zhou.framework.pojo.User;
import com.zhou.framework.service.UserService;
import com.zhou.framework.ws.UserWebService;

public class UserWebServiceImpl implements UserWebService{

	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public User login(String name,String password) {
		System.out.println("coming to test");
		System.out.println(name);
		System.out.println(password);
		User user=new User();
		user.setCreateTime(new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss").format(new Date()));
		user.setName(name);
		user.setPassword(password);		
		Gson gson=new Gson();
		System.out.println(gson.toJson(user));
		return user;
	}

	@Override
	public void register(User user) {
		System.out.println(user);
		System.out.println(user.getName());
		/*User 1=new User();
		user.setName("hello");
		user.setPassword("123456");*/
		//System.out.println(str);
	}

	@Override
	public String test() {
		
		return "user/test";
	}

}
