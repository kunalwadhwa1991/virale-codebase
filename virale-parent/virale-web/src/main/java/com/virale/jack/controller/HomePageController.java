package com.virale.jack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virale.jack.core.constants.ServiceQualifierConstants;
import com.virale.jack.services.CountryService;

@Controller
public class HomePageController {
	
	@Autowired
	@Qualifier(ServiceQualifierConstants.COUNTRY_SERVICE_IMPL)
	private CountryService countryService;
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String displayHomePage(){
		/*modelmap.addAttribute("cardsforcategory", new String("Ashu"));
		int countryId = countryService.getCountryFromName("India").getCountryId();
		modelmap.put("countryid", countryId);*/
		return "WelcomePage";		
	}

}
