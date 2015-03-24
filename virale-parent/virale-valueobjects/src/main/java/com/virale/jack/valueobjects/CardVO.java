package com.virale.jack.valueobjects;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class CardVO {

	private int cardId;
	private String cardTitle;
	private int cardQuantity;
	private double cardPrice;
	private String cardThumbImageName;
	private String cardFullImageName;
	private MultipartFile thumbImage;
	private MultipartFile fullImage;
	private String shortDescription;
	private String longDescription;
	private Date createDate;
	private Date updateDate;
	private String isActive;
	private double averageRating;
	private String creatorId;
	private int cardCategoryId;

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public int getCardCategoryId() {
		return cardCategoryId;
	}

	public void setCardCategoryId(int cardCategoryId) {
		this.cardCategoryId = cardCategoryId;
	}

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

	public MultipartFile getThumbImage() {
		return thumbImage;
	}

	public void setThumbImage(MultipartFile thumbImage) {
		this.thumbImage = thumbImage;
	}

	public MultipartFile getFullImage() {
		return fullImage;
	}

	public void setFullImage(MultipartFile fullImage) {
		this.fullImage = fullImage;
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

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

}
