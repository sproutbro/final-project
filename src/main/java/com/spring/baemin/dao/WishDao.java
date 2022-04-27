package com.spring.baemin.dao;

public interface WishDao {

	void wishInsert(Long store_no, String user_id);
	int wishCheck(Long store_no, String user_id);
	void wishDelete(Long store_no, String user_id);
	int wishCount(Long store_no);
	
}
