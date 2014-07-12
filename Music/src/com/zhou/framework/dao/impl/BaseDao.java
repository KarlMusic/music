package com.zhou.framework.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zhou.framework.dao.IBaseDao;

@Component
@Transactional
public class BaseDao implements IBaseDao{
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public <T> void add(T t) {

		sessionFactory.getCurrentSession().save(t);
		
	}

	@Override
	public <T> void delte(T t) {

		sessionFactory.getCurrentSession().delete(t);
		//getHibernateTemplate().delete(t);
	}

	//@Transactional
	@Override
	public Object findById(Class clazz, Serializable id) {
		return sessionFactory.getCurrentSession().get(clazz, id);
		//return getHibernateTemplate().get(clazz, id);
	}

	@Override
	public <T> void update(T t) {
		//getHibernateTemplate().update(t);
		sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public <T> T queryByPars(String hql,Object[] args) {

		return (T) sessionFactory.getCurrentSession().createQuery(hql).setParameters(args, null).uniqueResult();
	}

	

}
