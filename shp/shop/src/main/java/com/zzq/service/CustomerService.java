package com.zzq.service;

import javax.servlet.http.HttpServletResponse;

import com.zzq.domain.Customer;

/**
 * 
 * @author Administrator
 *	消費者接口
 */
public interface CustomerService {
	
	boolean login(String userName,String password);
	boolean register(Customer customer);
	
	
}
