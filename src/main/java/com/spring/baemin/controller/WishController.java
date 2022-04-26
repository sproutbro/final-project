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
		String user_id = (String) session.getAttribute("user_id");
		
		if(user_id == null) {
			return -1;			
		} else {
			return wishService.wishClick(store_no, user_id);			
		}
		
	}
	
	@RequestMapping(value = "wishCount", method = RequestMethod.POST)
	@ResponseBody
	public int wishCount(@RequestParam Long store_no, HttpSession session) {
		return wishService.wishCount(store_no);
	}
	
}
