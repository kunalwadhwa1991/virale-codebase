package com.virale.jack.services;

import java.util.Map;

import com.virale.jack.dataobjects.Card;

public interface CardService {
	public Map<Integer, Card> getCardsForCategory(int categoryId);
	
	public Map<Integer,String> getAllCategories();

}
