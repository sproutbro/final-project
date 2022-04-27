package com.spring.baemin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.baemin.dao.WishDao;

@Service
public class WishServiceImpl implements WishService {

	@Autowired
	private WishDao wishDao;
	
	@Override
	public int wishClick(Long store_no, String user_id) {
		
		int wishCount = wishDao.wishCheck(store_no, user_id);
		
		if(wishCount == 0) {
			wishDao.wishInsert(store_no, user_id);
			return 1;
		} else {
			wishDao.wishDelete(store_no, user_id);
			return 0;
		}
		
	}

	@Override
	public int wishCount(Long store_no) {
		return wishDao.wishCount(store_no);
	}

}
