package com.spring.baemin.domain;

import java.sql.Timestamp;

public class Review {
	private int r_no;
	private String user_id;
	private int product_no;
	private float r_scope;
	private Timestamp r_reg_date;
	private String r_img;
	private String r_content;
	/**
	 * @return the r_no
	 */
	public long getR_no() {
		return r_no;
	}
	/**
	 * @param r_no the r_no to set
	 */
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the product_no
	 */
	public long getProduct_no() {
		return product_no;
	}
	/**
	 * @param product_no the product_no to set
	 */
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	/**
	 * @return the r_scope
	 */
	public float getR_scope() {
		return r_scope;
	}
	/**
	 * @param r_scope the r_scope to set
	 */
	public void setR_scope(float r_scope) {
		this.r_scope = r_scope;
	}
	/**
	 * @return the r_reg_date
	 */
	public Timestamp getR_reg_date() {
		return r_reg_date;
	}
	/**
	 * @param r_reg_date the r_reg_date to set
	 */
	public void setR_reg_date(Timestamp r_reg_date) {
		this.r_reg_date = r_reg_date;
	}
	/**
	 * @return the r_img
	 */
	public String getR_img() {
		return r_img;
	}
	/**
	 * @param r_img the r_img to set
	 */
	public void setR_img(String r_img) {
		this.r_img = r_img;
	}
	/**
	 * @return the r_content
	 */
	public String getR_content() {
		return r_content;
	}
	/**
	 * @param r_content the r_content to set
	 */
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	
	
}
