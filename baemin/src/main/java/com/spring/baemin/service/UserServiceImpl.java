package com.spring.baemin.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.baemin.dao.UserDao;
import com.spring.baemin.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void userJoinProcess(User user) {
		userDao.userJoinProcess(user);
	}

	@Override
	public String userLoginProcess(HashMap<String, String> param) {
		return userDao.userLoginProcess(param);
	}

}
