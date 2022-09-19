package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "user_role", length = 20, nullable = false)
	private String userRole;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account(String user_name, String password, String name, String userRole) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.name = name;
		this.userRole = userRole;
	}

	public Account() {
		super();
	}
	
	
	
}
