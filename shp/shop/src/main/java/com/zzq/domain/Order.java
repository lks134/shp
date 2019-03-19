package com.zzq.domain;

public class Order {
	private long order_id;
	private double order_price;
	private Integer order_status;
	
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public double getOrder_price() {
		return order_price;
	}
	public void setOrder_price(double order_price) {
		this.order_price = order_price;
	}
	public Integer getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", order_price=" + order_price + ", order_status=" + order_status + "]";
	}
	
	
}
