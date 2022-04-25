package com.spring.baemin.service;

import java.util.HashMap;
import java.util.Map;

import com.spring.baemin.domain.User;

public interface UserService {

	void userJoinProcess(User user);

	String userLoginProcess(HashMap<String, String> param);
	
	public abstract Map<String, Object> userFindId(String user_email, String user_name);

	Map<String, Object> userFindPass(String user_email, String user_name, String user_id);
	
}
