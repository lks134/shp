package com.zzq.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zzq.domain.Customer;
import com.zzq.service.CustomerService;

@Controller

public class CustomerController {

	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(Model model,HttpServletRequest req){
		
		String userName=req.getParameter("userName");
		String password=req.getParameter("password");
		boolean login = customerService.login(userName, password);
		if(login){
			return "product";
		}
		return "login";
		
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(){
		return "register";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(Model model,HttpServletRequest req){
		String username=req.getParameter("userName");
		String password=req.getParameter("password");
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		Customer customer=new Customer(username,password,address,email,phone);
		
			boolean register = customerService.register(customer);
			if(register){
				
				return "login";
				
			}
			
			
			return "register";
		
		
		
	}
	
}
