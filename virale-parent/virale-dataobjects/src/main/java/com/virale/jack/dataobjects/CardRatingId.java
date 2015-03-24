package com.virale.jack.dataobjects;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CardRatingId implements Serializable {

	private String userId;

	private int cardId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

}
