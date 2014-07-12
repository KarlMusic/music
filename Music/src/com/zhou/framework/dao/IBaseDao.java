package com.zhou.framework.dao;

import java.io.Serializable;

public interface IBaseDao {

	<T>void add(T t);
	<T>void delte(T t);
	Object findById(Class clazz,Serializable id);
	<T>void update(T t);
	<T> T queryByPars(String hql,Object[] args);
}
