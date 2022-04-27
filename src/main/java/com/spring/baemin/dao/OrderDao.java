package com.spring.baemin.dao;

import java.util.List;

import com.spring.baemin.domain.Order;

public interface OrderDao {
	
	public abstract void odrInsert(Order order);
	
	public abstract List<Order> getOrderList(String user_id);
}
