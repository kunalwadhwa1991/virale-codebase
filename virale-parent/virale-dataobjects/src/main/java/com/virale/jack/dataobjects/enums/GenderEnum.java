package com.virale.jack.dataobjects.enums;

public enum GenderEnum {

	MALE(1, "male"), FEMALE(2, "female");
	GenderEnum(int genderId, String gender) {
		this.genderId = genderId;
		this.gender = gender;
	}

	private int genderId;
	private String gender;
	public int getGenderId() {
		return genderId;
	}
	public String getGender() {
		return gender;
	}
	
	

}
