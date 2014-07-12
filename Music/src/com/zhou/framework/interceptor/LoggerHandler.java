package com.zhou.framework.interceptor;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerHandler {

	@Pointcut("execution(* com.zhou.framework.dao.impl.*.*(..))")
	public void point() {

	}

	@Before("point() &&args(object)")
	public void before(Object object) {
		System.out.println(object.getClass());
		System.out.println("before");
	}

	@After("point()")
	public void after() {

		System.out.println("after");
	}

}
