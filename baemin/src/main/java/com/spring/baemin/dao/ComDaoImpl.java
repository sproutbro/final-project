package com.spring.baemin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComDaoImpl implements ComDao {
	
	private final String NAME_SPACE = "com.spring.baemin.mapper.ComMapper";

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public String comPassCheck(String comId) {
		
		
		String pass = sqlSession.selectOne(NAME_SPACE + ".comPassCheck", comId);

		return pass;
	}

}
