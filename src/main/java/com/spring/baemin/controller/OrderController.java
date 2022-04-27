package com.spring.baemin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping("odrForm")
	public String orderInsert(HttpSession session, Model model, 
			Order odr) {
		
		String user_id = (String) session.getAttribute("user_id");
		odr.setUser_id(user_id);
		
		Map<String, Object> odrMap = new HashMap<String, Object>();
		odrMap.put("odr", odr);
		odrMap.put("user_id", user_id);
		
		orderService.odrInsert(odrMap);
		System.out.println("asdfasd");
		return "redirect:/odrListForm";   
	}
	@RequestMapping("odrListForm")
	public String orderList(HttpSession session ) {
		
		String user_id = (String) session.getAttribute("user_in");
		
		List<Order> oList = orderService.getOrderList(user_id);
		
		System.out.println("1342");
		return "user/myPage/userOrderListForm";
	}
}
