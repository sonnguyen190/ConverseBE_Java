package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Account;
import com.entity.Shoes;

public interface AccountDao extends JpaRepository<Shoes,Integer>{
	public boolean addNewAccount(Account account);
}
