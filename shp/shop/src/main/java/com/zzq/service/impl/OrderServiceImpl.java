package com.zzq.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zzq.dao.OrderDao;
import com.zzq.domain.Order;
import com.zzq.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	private OrderDao orderdao;

	public int addOrder(Order order) {
		return orderdao.addOrder(order);
	}

	public List<Order> findOrder() {
		return orderdao.findOrder();
	}

	public void deleteOrder(Integer id) {
		orderdao.deleteOrder(id);
		
	}

	public int updateOrderStatus(Integer id) {
		
		return orderdao.updateOrderStatus(id);
	}

}
