package com.zzq.service;

import com.zzq.domain.Account;

public interface AccountService {
	//添加账户
	public boolean addAccount(Account account);
	//根据账户名称查询账户
	public Account findAccount(String caaount_name);
	//更新账户余额
	public int updateAccount(Integer id);
	//结算后账户余额
	public int updateAccountBalance(long id);
	public void deleteAccount(Integer id);
}
