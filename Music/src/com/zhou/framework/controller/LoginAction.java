package com.zhou.framework.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.xml.ws.Action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.opensymphony.xwork2.ActionSupport;
import com.zhou.framework.dao.IDepartMentDao;
import com.zhou.framework.pojo.User;
import com.zhou.framework.service.UserService;

@Controller
@RequestMapping("user")
public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = -6523615972666626404L;
	
	private UserService userService;
	
	
	@RequestMapping("/add")
	public ModelAndView save(User user)
	{
		
		user.setCreateTime(new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss").format(new Date()));
		System.out.println(user);
		System.out.println("coming...");
		userService.register(user);
		return new ModelAndView("/login");
	}

	
	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
}
