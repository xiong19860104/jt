package com.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.dao.UserDao;

@Controller
public class UserController {
	@Autowired
	public UserDao userDao;
	@RequestMapping("/doDelete")
	@ResponseBody
	public String doDeleteUser(Integer ...ids) {
		int a=userDao.deleteObjects(ids);
		return "删除ok";
		
	}
	@RequestMapping("/UI")
	public String doUI() {
		
		return "User";
		
	}

}
