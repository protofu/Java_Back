package com.kosta.service;

import java.sql.SQLException;

import com.kosta.model.User;

public interface UserService {
	User getUser(int id) throws SQLException;

//	void getUserList();

	void addUser() throws SQLException;

//	void modifyUser();

	void delUser();

	void addFollow();

	void delFollow();

	void getFollowList();
}
