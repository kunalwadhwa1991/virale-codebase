package com.virale.jack.dataobjects;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARDSTORE_CARDS")
public class Card {

	@Id
	@Column(name = "CARD_ID")
	private int cardId;

	@Column(name = "CARD_TITLE")
	private String cardTitle;

	@Column(name = "CARD_QUANTITY")
	private int cardQuantity;

	@Column(name = "CARD_PRICE")
	private double cardPrice;

	@Column(name = "CARD_THUMB_IMAGE")
	private String cardThumbImageName;

	@Column(name = "CARD_FULL_IMAGE")
	private String cardFullImageName;

	@Column(name = "CARD_SHORT_DESCRIPTION")
	private String shortDescription;

	@Column(name = "CARD_DETAIL_DESCRIPTION")
	private String longDescription;

	@Column(name = "CREATED_DATE")
	private Date createDate;

	@Column(name = "UPDATED_DATE")
	private Date updateDate;

	@Column(name = "IS_ACTIVE")
	private String isActive;

	@Column(name = "AVERAGE_RATING")
	private double averageRating;

	// uni directional many to one
	@ManyToOne
	@JoinColumn(name = "categoryId", referencedColumnName = "CATEGORY_ID")
	private CardCategory cardCategory;

	// uni directional many to one mapping
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private CardStoreUser creator;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardTitle() {
		return cardTitle;
	}

	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}

	public int getCardQuantity() {
		return cardQuantity;
	}

	public void setCardQuantity(int cardQuantity) {
		this.cardQuantity = cardQuantity;
	}

	public double getCardPrice() {
		return cardPrice;
	}

	public void setCardPrice(double cardPrice) {
		this.cardPrice = cardPrice;
	}

	public String getCardThumbImageName() {
		return cardThumbImageName;
	}

	public void setCardThumbImageName(String cardThumbImageName) {
		this.cardThumbImageName = cardThumbImageName;
	}

	public String getCardFullImageName() {
		return cardFullImageName;
	}

	public void setCardFullImageName(String cardFullImageName) {
		this.cardFullImageName = cardFullImageName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public CardCategory getCardCategory() {
		return cardCategory;
	}

	public void setCardCategory(CardCategory cardCategory) {
		this.cardCategory = cardCategory;
	}

	@Override
	public boolean equals(Object obj) {
		Card testCard = (Card) obj;
		if (this.cardId == testCard.cardId)
			return true;
		return false;
	}

	@Override
	public String toString() {
		String description = this.cardTitle + " " + this.cardPrice;
		return description;
	}

	public CardStoreUser getCreator() {
		return creator;
	}

	public void setCreator(CardStoreUser creator) {
		this.creator = creator;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
