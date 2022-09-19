package com.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ShoesRepositopry;
import com.entity.Shoes;
import com.service.GiayService;
@Service
@Transactional
public class giayserviceimpl implements GiayService{
	@Autowired
	private ShoesRepositopry giayrepo;
	
	@Override
	public List<Shoes> getallgiay() {
		
		return giayrepo.getAllGiay();
	}
	

}
