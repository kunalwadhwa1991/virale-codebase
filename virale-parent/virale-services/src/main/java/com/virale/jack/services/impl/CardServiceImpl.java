package com.virale.jack.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virale.jack.core.constants.ServiceQualifierConstants;
import com.virale.jack.dataobjects.Card;
import com.virale.jack.dataobjects.CardCategory;
import com.virale.jack.repository.CardRepository;
import com.virale.jack.repository.CategoryRepository;
import com.virale.jack.services.CardService;

@Service(ServiceQualifierConstants.CARD_SERVICE_IMPL)
public class CardServiceImpl implements CardService {

	@Autowired
	private CardRepository cardRepository;

	@Autowired
	private CategoryRepository categoryrepository;

	@Override
	public Map<Integer, Card> getCardsForCategory(int categoryId) {
		List<Card> cards = null;
		Map<Integer, Card> cardsMap = null;
		cards = cardRepository.findByCardCategoryCategoryId(categoryId);
		if (!CollectionUtils.isEmpty(cards)) {
			cardsMap = new HashMap<>();
			for (Card card : cards) {
				cardsMap.put(card.getCardId(), card);
			}
		}
		return cardsMap;
	}

	@Override
	public Map<Integer, String> getAllCategories() {
		Map<Integer, String> allCategoriesMap = null;
		List<CardCategory> categories = null;
		categories = categoryrepository.findAll();
		if (!CollectionUtils.isEmpty(categories)) {
			allCategoriesMap = new HashMap<>();
			for (CardCategory cardCategory : categories) {
				allCategoriesMap.put(cardCategory.getCategoryId(),
						cardCategory.getCategoryName());
			}
		}

		return allCategoriesMap;
	}

}
