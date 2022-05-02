package com.spring.baemin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.baemin.dao.ReviewDao;
import com.spring.baemin.domain.Review;

@Service
public class ReviewServiceImpl implements ReviewService {

	private ReviewDao reviewDao;
	
	@Autowired
	public ReviewServiceImpl(ReviewDao reviewDao) {
		this.reviewDao = reviewDao;
	}
	
	@Override
	public void insertReview(Review review) {
		reviewDao.insertReview(review);
	}

	
	
}
