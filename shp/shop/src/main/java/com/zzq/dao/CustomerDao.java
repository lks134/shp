package com.zzq.dao;


import java.util.List;

import com.zzq.domain.Customer;

public interface CustomerDao {

	//根据名称查找消费者
	public Customer findCustomerByUserName(String userName);
	//添加消费者
	public int addCustomer(Customer customer);
	
	
	
}
