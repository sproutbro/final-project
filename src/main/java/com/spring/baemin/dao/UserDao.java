package com.spring.baemin.dao;

import java.util.HashMap;

import com.spring.baemin.domain.User;

public interface UserDao {

	void userJoinProcess(User user);

	String userLoginProcess(HashMap<String, String> param);
	
	public abstract int userEmailCheck(String user_email);
	public abstract int userNameCheck(String user_email, String user_name);
	public abstract int userIdCheck(String user_email, String user_name, String user_id);
	public abstract String getUserId(String user_email);
	
	// ########### odrService - getUser() ##########
	public abstract User getUser(String user_id);

	String getUserPass(String user_email, String user_name, String user_id);

}
