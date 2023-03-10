package com.spring.portal.state.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.portal.state.entity.Country_Entity;

public interface MyCountryRepo extends JpaRepository<Country_Entity, Integer>
  {
     
	
  }
