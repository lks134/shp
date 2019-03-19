package com.zzq.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzq.domain.Account;
import com.zzq.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	@RequestMapping(value="/addAccount",method=RequestMethod.GET)
	public String addAccount(){
		return "account";
	}
	@RequestMapping(value="/addAccount",method=RequestMethod.POST)
	public String addAccount(Model model,HttpServletRequest req){
		String userName=req.getParameter("userName");
		String account_name=req.getParameter("account_name");
		String account_password=req.getParameter("account_password");
		Account account = new Account(userName,account_name,account_password);
		boolean addAccount = accountService.addAccount(account);
		if(addAccount){
			
			return "head";
		}
		model.addAttribute("账户已存在");
		return "Account";
	}
	@RequestMapping(value="selectAccount",method=RequestMethod.GET)
	public String selectAccount(){
		return "selectAccount";
	}
	@RequestMapping(value="selectAccount",method=RequestMethod.POST)
	public String selectAccount(Model model,HttpServletRequest req){
		String parameter = req.getParameter("userName");
		Account account = accountService.findAccount(parameter);
		model.addAttribute("account_id",account.getAccount_id());
		model.addAttribute("userName",account.getUserName());
		model.addAttribute("account_name",account.getaccount_name());
		model.addAttribute("account_balance",account.getAccount_balance());
		return "Account";
	}
	@RequestMapping(value="/account/edit.action")
	public @ResponseBody
	Account edit(String userName){
		return accountService.findAccount(userName);
	}
	@RequestMapping(value="account/update.action")
	public @ResponseBody
	String update(Integer id){
		accountService.updateAccount(id);
		return "ok";
	}
	public @ResponseBody
	String delete(Integer id){
		accountService.deleteAccount(id);
		return "ok";
	}
}
