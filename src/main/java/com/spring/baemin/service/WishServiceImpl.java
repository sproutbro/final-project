package com.spring.baemin.service;

import org.springframework.stereotype.Service;

@Service
public class WishServiceImpl implements WishService {

	@Override
	public int wishClick(Long store_no, String user_id) {
		System.out.println("service : " + store_no + " : " + user_id);
		return 0;
	}

}
