package com.kosta.service;

import java.sql.SQLException;

public interface PostService {
	void getPostList() throws SQLException;

	void addPost();

//	void getPost();

	void delPost();

	void modifyPost();

	void addLike();

	void delLike();
}
