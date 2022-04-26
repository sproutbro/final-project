package com.spring.baemin.service;

import java.util.List;

import com.spring.baemin.domain.Store;

public interface SearchService {
	List<Store> storeSerch(String searchKey);
}
