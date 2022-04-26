package com.spring.baemin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.baemin.domain.Store;

@Repository
public class SearchDaoImpl implements SearchDao {
	
	private final String NAME_SPACE = "com.spring.baemin.mapper.SearchMapper";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<Store> storeSearch(String searchKey) {
		return sqlSession.selectList(NAME_SPACE + ".storeSearch", searchKey);
	}

}
