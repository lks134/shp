package com.zzq.dao;

import com.zzq.domain.Account;

public interface AccountDao {
	//添加账户
	public int addAccount(Account account);
	//根据账户名称查询账户
	public Account findAccount(String userName);
	//删除账户通过id
	public void deleteAccount(Integer id);
	//更新账户余额
	public int updateAccount(Integer id);
	//结算后账户余额
	public int updateAccountBalance(long id);
}
