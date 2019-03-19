package com.zzq.service;

import java.util.List;

import com.zzq.domain.Order;

public interface OrderService {
	//添加订单
		public int addOrder(Order order);
		//查询订单
		public List<Order> findOrder();
		//根据id删除订单
		public void deleteOrder(Integer id);
		//修改订单状态根据id
		public int updateOrderStatus(Integer id);
}
