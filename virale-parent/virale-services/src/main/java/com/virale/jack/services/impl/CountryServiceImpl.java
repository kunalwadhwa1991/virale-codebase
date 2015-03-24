package com.virale.jack.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virale.jack.core.constants.ServiceQualifierConstants;
import com.virale.jack.dataobjects.Country;
import com.virale.jack.repository.CountryRepository;
import com.virale.jack.services.CountryService;

@Service(ServiceQualifierConstants.COUNTRY_SERVICE_IMPL)
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Country getCountryFromName(String name) {
		Country country = countryRepository.findByCountryName(name);
		return country;
	}

}
