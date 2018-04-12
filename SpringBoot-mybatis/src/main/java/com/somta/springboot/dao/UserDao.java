package com.somta.springboot.dao;

import com.somta.springboot.pojo.User;

public interface UserDao {

	int addUser(User user);
	
	int updateUserById(User user);

}
