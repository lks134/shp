package com.zzq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.AccountDao;
import com.zzq.domain.Account;
import com.zzq.service.AccountService;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao accountDao;

	public boolean addAccount(Account account) {
		if(accountDao.findAccount(account.getUserName())!=null){
			try {
				throw new Exception("该账户已存在");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			accountDao.addAccount(account);
			return true;
		}
		return true;
	}

	public Account findAccount(String userName) {
		
		return accountDao.findAccount(userName);
	}

	public int updateAccount(Integer id) {
		
		return accountDao.updateAccount(id);
	}

	public int updateAccountBalance(long id) {
		
		return accountDao.updateAccountBalance(id);
	}

	public void deleteAccount(Integer id) {
		accountDao.deleteAccount(id);
		
	}

	

}
