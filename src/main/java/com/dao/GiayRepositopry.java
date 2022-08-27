package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.Giay;
@Repository
public interface GiayRepositopry extends JpaRepository<Giay,Integer>{
	@Query(value = "select c from Giay c")
	public List<Giay> getAllGiay();
}
