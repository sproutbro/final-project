package com.spring.baemin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.baemin.domain.Order;

@Repository
public class OrderDaoImpl implements OrderDao{
	private final String NAME_SPACE = "com.spring.baemin.mapper.OrderMapper";
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public void odrInsert(Order odr) {
		sqlSession.insert(NAME_SPACE + ".odrInsert", odr);
	}


//	@Override
//	public void odrDelete(int odrNo) {
//		sqlSession.selectOne(NAME_SPACE + ".odrDelete", odrNo);
//	}

}
