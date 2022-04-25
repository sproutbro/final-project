package com.spring.baemin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.baemin.dao.CartDao;
import com.spring.baemin.dao.OrderDao;
import com.spring.baemin.dao.ProductDao;
import com.spring.baemin.dao.StoreDao;
import com.spring.baemin.dao.UserDao;
import com.spring.baemin.domain.Cart;
import com.spring.baemin.domain.Order;
import com.spring.baemin.domain.Store;
import com.spring.baemin.domain.User;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao odrDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private CartDao cartDao;
	@Autowired
	private ProductDao productDao;
	@Autowired
	private StoreDao storeDao;
	
	
	@Override
	public User odrForm(String user_id) {
		User user = userDao.getUser(user_id);		
		return user;
	}


	@Override
	public Map<String, Object> odrInsert(Map<String, Object> odrMap) {
		
		String user_id = (String) odrMap.get("user_id");
		Order odr = (Order) odrMap.get("odr");
		
		// odrInsert
		odrDao.odrInsert(odr);
		
		// getOdrList
		int productNo = cartDao.getCartList(user_id).get(0).getProductNo(); 
		int storeNo = productDao.getProduct(productNo).getStoreNo();
		
		
		// cartDelete
		int cartNo = 0;
		cartDao.cartDelete(cartNo, user_id);
		
		
		
		
		
		
		
		
		
		Store oStore = storeDao.getStore(storeNo);
		
		
		
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		
		modelMap.put("oStore", oStore);
		
		return null;
	}




}
