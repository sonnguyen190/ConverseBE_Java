package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Giay;
import com.service.GiayService;

@Controller
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class controllergiay {
@Autowired
@Qualifier("giayserviceimpl") 
private GiayService giayservicce;

@RequestMapping(value = {"/"},method = RequestMethod.GET)
@ResponseBody
public String getalll(){
	 String aa = "hahaha";
	return aa;
}

@RequestMapping(value = {"/All"},method = RequestMethod.GET)
@ResponseBody
public List<Giay> getall(){
	 List<Giay> Giay = giayservicce.getallgiay();
	return Giay;
}
@RequestMapping(value = {"/HighTop"},method = RequestMethod.GET)
@ResponseBody
public List<Giay> getHighTop(){
	 List<Giay> Giay = giayservicce.getallgiay();
	return Giay;
}

}
