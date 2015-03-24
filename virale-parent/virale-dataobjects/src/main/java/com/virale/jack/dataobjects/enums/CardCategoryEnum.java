package com.virale.jack.dataobjects.enums;

public enum CardCategoryEnum {

	valentine(1,"Valentine Day"),
	birthday(2,"Birthday"),
	anniversary(3,"Anniversary"),
	friendship(4,"Friendship"),
	bestwishes(5,"Best Wishes");
	
	CardCategoryEnum(int categoryId,String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	 
	private int categoryId;
	private String categoryName;
	public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	
};
