package com.zzq.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.CustomerDao;
import com.zzq.domain.Customer;
import com.zzq.service.CustomerService;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {



	@Autowired
	private CustomerDao customerDao;
	
	public boolean login(String userName, String password) {

		Customer c = customerDao.findCustomerByUserName(userName);
		if(c != null && c.getPassWord().equals(password)){
			return true;
		}
		return false;
	}

	public boolean register(Customer customer) {
		if(customerDao.findCustomerByUserName(customer.getUserName())!=null){
			try {
				throw new Exception("您注册的用户已存在");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			customerDao.addCustomer(customer);
			return true;
		}
			 
		
		return false;
		
		
		
		
	}

	

	

}
