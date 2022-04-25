package com.spring.baemin.service;

import java.util.HashMap;
import java.util.Map;

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

	@Override
	public Map<String, Object> userFindId(String user_email, String user_name) {
		int result = -1;
		System.out.println("@Service1");
		int emailCheck = userDao.userEmailCheck(user_email);
		int nameCheck = userDao.userNameCheck(user_email, user_name);
		String user_id = "";
		
		if(emailCheck == 1 && nameCheck == 0) {
			result = 0;
		} 
		if(nameCheck == 1 && nameCheck ==1) {
			result = 1;
			user_id = userDao.getUserId(user_email);
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("user_id", user_id);
		map.put("result", result);
		
		System.out.println("@Service2");
		return map;
	}
	
	@Override
	public Map<String, Object> userFindPass(String user_email, String user_name, String user_id){
	 
		int result = -1;
	 
		int emailCheck = userDao.userEmailCheck(user_email);
		int nameCheck = userDao.userNameCheck(user_email, user_name);
		int idCheck = userDao.userIdCheck(user_email, user_name, user_id); 
		String user_pass = "";
	
		if(emailCheck == 1 && nameCheck == 0 && idCheck == 0) { 
			result = 0; 
			System.out.println(emailCheck + "이메일 1");
			System.out.println(nameCheck + "이름 1");
			System.out.println(idCheck + "아이디 1");
		}
		else if(emailCheck == 1 && nameCheck == 1 && idCheck == 0) {
			System.out.println(emailCheck + " 2");
			System.out.println(nameCheck + " 2");
			System.out.println(idCheck + " 2");
			result = 1;
		}
		else if(emailCheck == 1 && nameCheck == 1 && idCheck == 1) {
			System.out.println(emailCheck + "4");
			System.out.println(nameCheck + "4");
			System.out.println(idCheck + "4");
			result = 3; 
			user_pass = userDao.getUserPass(user_email,user_name, user_id);
		}
		System.out.println(result + "1");
		System.out.println(result + "2");
		System.out.println(result + "3");
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("user_pass", user_pass);
		map.put("result", result);
	
	 
		return map;
	
	}
	

}
