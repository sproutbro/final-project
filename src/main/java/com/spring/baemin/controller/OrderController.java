package com.spring.baemin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.baemin.domain.Order;
import com.spring.baemin.domain.User;
import com.spring.baemin.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("orderForm")
	public String orderForm(HttpSession session, Model model, int totalAmt) {
		
		String user_id = (String) session.getAttribute("user_id");
		User user = orderService.odrForm(user_id);
		model.addAttribute("user", user);
		model.addAttribute("totalAmt", totalAmt);
		return "order/orderForm";   
	}
	
	@RequestMapping("odrInsert")
	public String orderInsert(HttpSession session, Model model,
						Order odr) {
		
		
		
		
		
		
		String user_id = (String) session.getAttribute("user_id");
		odr.setUser_id(user_id);
		
		Map<String, Object> odrMap = new HashMap<String, Object>();
		odrMap.put("odr", odr);
		odrMap.put("user_id", user_id);
		
		odrMap = orderService.odrInsert(odrMap);
		
		return "user/myPage/userOrderListForm";   
	}
}
