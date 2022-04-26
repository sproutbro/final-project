package com.spring.baemin.service;

public interface WishService {
	int wishClick(Long store_no, String user_id);

	int wishCount(Long store_no);
}
