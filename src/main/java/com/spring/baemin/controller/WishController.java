package com.spring.baemin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.baemin.service.WishService;

@Controller
public class WishController {
	
	@Autowired private WishService wishService;
	
	@RequestMapping(value = "wishClick", method = RequestMethod.POST)
	@ResponseBody
	public int wishClick(@RequestParam Long store_no, HttpSession session) {
		int result = -1;
		
		String user_id = (String) session.getAttribute("user_id");
		
		if(user_id != null) {
			wishService.wishClick(store_no, user_id);
			result = 1;
		} else {
			System.out.println("꺼져");
			System.out.println(user_id);
			System.out.println(store_no);
		}
		
		return result;
	}
	
}
