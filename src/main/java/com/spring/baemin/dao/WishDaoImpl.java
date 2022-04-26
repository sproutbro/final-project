package com.spring.baemin.dao;

public class WishDaoImpl implements WishDao {

	@Override
	public int wishClick(Long store_no, String user_id) {
		System.out.println(store_no + " : " + user_id);
		return 0;
	}

}
