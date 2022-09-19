package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.Shoes;
@Repository
public interface ShoesRepositopry extends JpaRepository<Shoes,Integer>{
	@Query(value = "select c from Shoes c")
	public List<Shoes> getAllGiay();
}
