package com.spring.portal.state.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.portal.state.entity.Country_Entity;
import com.spring.portal.state.repo.MyCountryRepo;

 @Service
public class My_Service {
     
	 @Autowired
     private MyCountryRepo mycountryrepo ;
	
	
	
	public List<Country_Entity> getdata()
	{
		List<Country_Entity> country =mycountryrepo.findAll();
         return country ;
        
	}
	
	 public void savedata(Country_Entity country)
	 {
		 mycountryrepo.save(country);
		 
	 }
	
	
	
}
