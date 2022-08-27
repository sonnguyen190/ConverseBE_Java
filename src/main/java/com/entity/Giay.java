package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Giay {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private int id;

@Column(name="ten_giay")
private String ten_giay;

@Column(name="price")
private int price;

@Column(name="hinh_giay")
private String hinh_giay;

@Column(name="loai_giay")
private String loai_giay;

@Column(name="platform")
private boolean platform;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTen_giay() {
	return ten_giay;
}

public void setTen_giay(String ten_giay) {
	this.ten_giay = ten_giay;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getHinh_giay() {
	return hinh_giay;
}

public void setHinh_giay(String hinh_giay) {
	this.hinh_giay = hinh_giay;
}

public String getLoai_giay() {
	return loai_giay;
}

public void setLoai_giay(String loai_giay) {
	this.loai_giay = loai_giay;
}

public boolean isPlatform() {
	return platform;
}

public void setPlatform(boolean platform) {
	this.platform = platform;
}

public Giay(int id, String ten_giay, int price, String hinh_giay, String loai_giay, boolean platform) {
	super();
	this.id = id;
	this.ten_giay = ten_giay;
	this.price = price;
	this.hinh_giay = hinh_giay;
	this.loai_giay = loai_giay;
	this.platform = platform;
}

public Giay() {
	super();
}


}


