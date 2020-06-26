package com.fse.projmanager.service;

import java.util.List;

import com.fse.projmanager.entity.User;

public interface UserService {

	User addUser(User user);
	List<User> getAllUser();
	void deleteUser(long userID);
	User editUser(User user);
}
