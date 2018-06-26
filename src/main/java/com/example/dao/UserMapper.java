package com.example.dao;

import org.apache.ibatis.annotations.Insert;

import com.example.demo.User;

public interface UserMapper {
	
	@Insert("insert into user(id,name) values(#{id},#{name})")
	public void insertUser(User user);
}
