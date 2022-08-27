package com.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.GiayRepositopry;
import com.entity.Giay;
import com.service.GiayService;
@Service
@Transactional
public class giayserviceimpl implements GiayService{
	@Autowired
	private GiayRepositopry giayrepo;
	
	@Override
	public List<Giay> getallgiay() {
		
		return giayrepo.getAllGiay();
	}
	

}
