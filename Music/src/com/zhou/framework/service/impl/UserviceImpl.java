package com.zhou.framework.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhou.framework.dao.IUserDao;
import com.zhou.framework.pojo.User;
import com.zhou.framework.service.UserService;

@Service
public class UserviceImpl extends BaseServiceImpl implements UserService {

	private IUserDao userDao;
	
	public IUserDao getUserDao() {
		return userDao;
	}
	@Resource
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(User user) {
		String[] par=new String[]{user.getName(),user.getPassword()};
		String hql="from User where name=? and password=?";
		return  userDao.queryByPars(hql, par);
	}

	@Override
	public void register(User user) {
		userDao.add(user);
	}

}
