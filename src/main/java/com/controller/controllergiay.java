package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Account;
import com.entity.Shoes;
import com.service.AccountService;

import com.service.GiayService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class controllergiay {
	@Autowired
	@Qualifier("accountServiceImpl") 
	private AccountService accountService;
	
	@Autowired
	@Qualifier("giayserviceimpl")
	private GiayService giayservicce;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	@ResponseBody
	public String getalll() {
		String aa = "hahaha";
		return aa;
	}

	@GetMapping(value = { "/All" })
	@ResponseBody
	public List<Shoes> getall() {
		List<Shoes> Giay = giayservicce.getallgiay();
		return Giay;
	}

	@RequestMapping(value = { "/HighTop" }, method = RequestMethod.GET)
	@ResponseBody
	public List<Shoes> getHighTop() {
		List<Shoes> Giay = giayservicce.getallgiay();
		return Giay;
	}

	@RequestMapping(value = { "/LowTop" }, method = RequestMethod.GET)
	@ResponseBody
	public List<Shoes> getLowTop() {
		List<Shoes> Giay = giayservicce.getallgiay();
		return Giay;
	}
	
	@PostMapping(value = { "/signup" })
	@ResponseBody
	public Account SignUp(HttpServletRequest request, @RequestBody Account account) {
		Account newAccount = new Account();
		newAccount.setName(account.getName());
		newAccount.setUser_name(account.getUser_name());
		newAccount.setPassword(account.getPassword());
		newAccount.setUserRole(account.getUserRole());
		boolean isInserted = accountService.addNewAccount(newAccount);
		if (isInserted) {
			System.out.println("Add New Employee Successfully.");
		}
		return newAccount;
	}

}
