package com.zhou.framework.service;

import com.zhou.framework.pojo.User;


public interface UserService extends IBaseService{

	public User login(User user);
	public void register(User user);
}
