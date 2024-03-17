package com.example.servicediscovery.service;

import java.util.List;

import com.example.servicediscovery.model.User;

public interface UserServiceCls {

	  User getUserById(Long userId);
	    List<User> getAllUsers();
	    User updateUser(Long userId, User user);
	    void deleteUser(Long userId);
		User createUser(User user);

}
