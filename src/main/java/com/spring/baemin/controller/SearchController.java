package com.spring.baemin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.baemin.domain.Store;
import com.spring.baemin.service.SearchService;

@Controller
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value = "storeSearch", method = RequestMethod.POST)
	@ResponseBody
	public List<Store> storeSearch(@RequestParam String searchKey, HttpSession session) {
		String user_id = (String) session.getAttribute("user_id");
		
		System.out.println(user_id + "가  이거검색함" + searchKey);
		
		return searchService.storeSerch(searchKey);
	}
	
}