package com.spring.baemin.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.baemin.domain.Cart;
import com.spring.baemin.service.CartService;

@Controller                 
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("cartInsert")
	public String cartInsert(int productNo, int cartCnt, int cartAmt, 
				HttpSession session, RedirectAttributes reAttr) {
		
		String user_id = (String) session.getAttribute("user_id");
		
		Cart cart = new Cart();
		cart.setUser_id(user_id);
		cart.setProductNo(productNo);
		cart.setCartCnt(cartCnt);
		cart.setCartAmt(cartAmt);
		
		cartService.cartAdd(cart);
		
		reAttr.addAttribute("productNo", productNo);
		
		return "redirect:productDetailForm";
	}
	
	@RequestMapping("cartForm")
	public String  getCartList(Model model, HttpSession session) {
		String user_id = (String) session.getAttribute("user_id");
		
		Map<String, Object> modelMap = cartService.getCartList(user_id);
		
		model.addAllAttributes(modelMap);
		return "cart/cartListForm";
	}
	
	@RequestMapping("cartDelete")
	public String cartDelete(HttpSession session, int cartNo) {
		String user_id = (String) session.getAttribute("user_id");
		cartService.cartDelete(cartNo, user_id);
		return "redirect:cart/cartListForm";
	}
	
}
