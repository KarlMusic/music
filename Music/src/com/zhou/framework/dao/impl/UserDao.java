package com.zhou.framework.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zhou.framework.dao.IEmployeeDao;
import com.zhou.framework.dao.IUserDao;

@Component
public class UserDao extends BaseDao implements IUserDao{

}
