package com.spring.baemin.dao;

import java.util.List;

import com.spring.baemin.domain.Order;
import com.spring.baemin.domain.User;

public interface OrderDao {
	
	public abstract void odrInsert(Order order);
	
//	public abstract void odrDelete(int odrNo);
}
