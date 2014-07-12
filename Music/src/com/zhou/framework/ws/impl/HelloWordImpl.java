package com.zhou.framework.ws.impl;

import com.zhou.framework.ws.HelloWord;

public class HelloWordImpl implements HelloWord{

	@Override
	public String say() {
		return "hello";
	}

	@Override
	public Employee get() {
		System.out.println("coming ...");
		Employee e=new Employee();
		e.setName("karl");
		e.setSalary(1000f);
		e.setSex("ÄÐ");
		return e;
	}

}
