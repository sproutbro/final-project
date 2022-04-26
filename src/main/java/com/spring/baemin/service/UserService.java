package com.spring.baemin.service;

import java.util.Map;

import com.spring.baemin.domain.User;

public interface UserService {

	void userJoinProcess(User user);

	public abstract Map<String, Object> userLoginProcess(String user_pass, String user_id);
	
	public abstract Map<String, Object> userFindId(String user_email, String user_name);

	Map<String, Object> userFindPass(String user_email, String user_name, String user_id);
	
}
