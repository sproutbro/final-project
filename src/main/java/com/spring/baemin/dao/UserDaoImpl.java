package com.spring.baemin.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.baemin.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	private final String NAME_SPACE = "com.spring.baemin.mapper.UserMapper";

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public void userJoinProcess(User user) {
		sqlSession.insert(NAME_SPACE + ".userJoinProcess", user);
	}

	@Override
	public String userLoginProcess(HashMap<String, String> param) {

		return sqlSession.selectOne(NAME_SPACE + ".userLoginProcess", param);

	}
	
	
	// ########### odrService - getUser() #########
	@Override
	public User getUser(String user_id) {
		return sqlSession.selectOne(NAME_SPACE + ".getUser", user_id);
	}

}
