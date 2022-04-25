package com.spring.baemin.service;

import java.util.HashMap;

import com.spring.baemin.domain.User;

public interface UserService {

	void userJoinProcess(User user);

	String userLoginProcess(HashMap<String, String> param);

}
