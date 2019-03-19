package com.zzq.domain;

public class Shopcar {
	private long shopcar_id;
	private long product_id;
	private String product_name;
	private double product_price;
	private Integer product_count;
	public Integer getProduct_count() {
		return product_count;
	}
	public void setProduct_count(Integer product_count) {
		this.product_count = product_count;
	}
	public long getShopcar_id() {
		return shopcar_id;
	}
	public void setShopcar_id(long shopcar_id) {
		this.shopcar_id = shopcar_id;
	}
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
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
	
	
}
