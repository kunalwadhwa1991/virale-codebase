package com.virale.jack.dataobjects;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "CARD_RATING")
public class CardRating {

	@EmbeddedId
	private CardRatingId cardRatingid;

	@Column(name = "CARD_RATING")
	private int rating;

	@Column(name = "CARD_RATING_DATE")
	private Date ratingDate;

	// uni directional many to one mapping
	@MapsId("userId")
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private CardStoreUser user;

	// uni directional many to one mapping
	@MapsId("cardId")
	@ManyToOne
	@JoinColumn(name = "CARD_ID")
	private Card card;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getRatingDate() {
		return ratingDate;
	}

	public void setRatingDate(Date ratingDate) {
		this.ratingDate = ratingDate;
	}

	public CardStoreUser getUser() {
		return user;
	}

	public void setUser(CardStoreUser user) {
		this.user = user;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
