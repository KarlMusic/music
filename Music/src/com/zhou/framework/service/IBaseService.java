package com.zhou.framework.service;

public interface IBaseService {

	public <T> void save(T t);
	
	public <T> void delete(T t);
	public <T> void update(T t);
	public <T> void getAll(T t);
	
}
