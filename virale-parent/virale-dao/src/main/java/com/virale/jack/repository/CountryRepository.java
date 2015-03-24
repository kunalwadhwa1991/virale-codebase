package com.virale.jack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virale.jack.dataobjects.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{
	
	public Country findByCountryName(String countryName);
	
}
