package com.spring.baemin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.baemin.domain.Product;
import com.spring.baemin.domain.Store;
import com.spring.baemin.service.ProductService;
import com.spring.baemin.service.StoreService;

@Controller
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping("storeInsert")
	public String storeInsertProcess(Store store, String phone1, String phone2, String phone3 ) {
		store.setStorePhone(phone1 + "-" + phone2 + "-" + phone3);
		storeService.storeInsert(store);
		return "redirect:company";
	}
	
	@RequestMapping("storeListForm")
	public String storeList(Model model, String comId,int mainCat) {
		Map<String, Object> mapModel = storeService.getStoreList(comId, mainCat);
		model.addAllAttributes(mapModel);
		
		return "product/storeListForm";
	}
	
	@RequestMapping("storeDetailForm")
	public String getStore(Model model, Product product, String comId) {
		Map<String, Object> mapModel = new HashMap<String, Object>();
		mapModel = productService.getProductList(product.getStoreNo());
		
		model.addAttribute("storeNo", product.getStoreNo());
		model.addAllAttributes(mapModel);
		
		return "product/storeDetailForm";
	}
}
