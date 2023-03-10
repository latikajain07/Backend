package com.spring.portal.state.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.portal.state.entity.Country_Entity;
import com.spring.portal.state.service.My_Service;

@RestController 
public class My_Controller  {
    
	@Autowired
	private My_Service my_Service;
	
	@GetMapping("/getdata")
	public List<Country_Entity> getdata()
	{
	List<Country_Entity> country= my_Service.getdata();
		return country ;
	}
	
	@PostMapping("/savedata")
	public void savedata(@RequestBody Country_Entity country)
	{	
		my_Service.savedata(country);
	    
	}
	  
	
    }
