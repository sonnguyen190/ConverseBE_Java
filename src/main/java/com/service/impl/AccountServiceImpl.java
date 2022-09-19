package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AccountDao;
import com.entity.Account;
import com.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDao accountDao;
	
	@Override
	public boolean addNewAccount(Account account) {
		return accountDao.addNewAccount(account);
	}
	
}
