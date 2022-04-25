package com.spring.baemin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.baemin.dao.ComDao;

@Service
public class ComServiceImpl implements ComService {
	@Autowired
	private ComDao comDao;

	@Override
	public String comPassCheck(String comId) {
		return comDao.comPassCheck(comId);
	}

}
