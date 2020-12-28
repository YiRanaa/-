package com.yiran.sp01.service;

import com.yiran.sp01.pojo.User;

public interface UserService {

	void addScore(Integer id, Integer score);

	User getUser(Integer id);
	
}
