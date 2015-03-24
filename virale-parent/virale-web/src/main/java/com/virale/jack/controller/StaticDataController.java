package com.virale.jack.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virale.jack.core.constants.ServiceQualifierConstants;
import com.virale.jack.core.constants.UrlConstants;
import com.virale.jack.dataobjects.Card;
import com.virale.jack.services.CardService;

@Controller
public class StaticDataController {

	@Autowired
	@Qualifier(ServiceQualifierConstants.CARD_SERVICE_IMPL)
	private CardService cardService;

	@RequestMapping(value = UrlConstants.GET_CARDS_FOR_CATERGORY, method = RequestMethod.POST)
	public Map<Integer, Card> getCardsCategory(String categoryId) {
		int id = Integer.parseInt(categoryId);
		Map<Integer, Card> cards = cardService.getCardsForCategory(id);
		return cards;
	}

	@RequestMapping(value = UrlConstants.GET_ALL_CATEGORIES, method = RequestMethod.GET)
	public String getAllCategories(ModelMap modelMap) {
		modelMap.addAttribute("allCategoriesMap",
				cardService.getAllCategories());
		return "WelcomePage";
	}

}
