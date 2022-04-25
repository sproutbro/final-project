package com.spring.baemin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.baemin.domain.Store;

@Repository
public class StoreDaoImpl implements StoreDao {
	
	private final String NAME_SPACE = "com.spring.baemin.mapper.StoreMapper";

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public void storeInsert(Store store) {
		sqlSession.selectOne(NAME_SPACE + ".storeInsert", store);
	}
	
	@Override
	public Store getStore(int storeNo) {
		return sqlSession.selectOne(NAME_SPACE + ".getStore", storeNo);
	}
	
	@Override
	public List<Store> getStoreList(String comId) {	
		Map<String, Object> mapModel = new HashMap<String, Object>();
		mapModel.put("comId", comId);
		return sqlSession.selectList(NAME_SPACE + ".getStoreList", mapModel);
	}
	
}
