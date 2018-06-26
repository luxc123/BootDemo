package com.example.demo;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserMapper;

@RestController
public class TestController {

	@Resource
	private UserMapper userMapper;
	
	@RequestMapping("/test")
	public String test(){
		
		return "spring boot";
	}
	
	@RequestMapping("insert")
	public String insert(){
		User user = new User();
		user.setId(12);
		user.setName("小明");
		userMapper.insertUser(user);
		return "插入成功!";
	}
}
