package com.spring.baemin.ajax;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.baemin.domain.Cart;
import com.spring.baemin.service.CartService;

@Controller
public class CartAjaxController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("cartInsert")
	@ResponseBody
	public void cartInsert(int productNo, int cartCnt, int cartAmt, 
				HttpSession session) {
		
		String user_id = (String) session.getAttribute("user_id");
		
		Cart cart = new Cart();
		cart.setUser_id(user_id);
		cart.setProductNo(productNo);
		cart.setCartCnt(cartCnt);
		cart.setCartAmt(cartAmt);
		
		cartService.cartAdd(cart);
		
	}
	
	
}
