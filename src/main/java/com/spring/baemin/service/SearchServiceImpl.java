package com.spring.baemin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.baemin.dao.SearchDao;
import com.spring.baemin.domain.Store;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchDao searchDao;
	
	@Override
	public List<Store> storeSerch(String searchKey) {
		return searchDao.storeSearch(searchKey);
	}

}
