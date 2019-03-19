package com.zzq.domain;

import java.util.HashMap;

public class Product {
	private HashMap<Integer, Integer> productlist;
	private int product_id;
	private String product_name;
	private double product_price;
	private Integer product_count;
	
	public HashMap<Integer, Integer> getProductlist() {
		return productlist;
	}
	public void setProductlist(HashMap<Integer, Integer> productlist) {
		this.productlist = productlist;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public Integer getProduct_count() {
		return product_count;
	}
	public void setProduct_count(Integer product_count) {
		this.product_count = product_count;
	}
	
}
