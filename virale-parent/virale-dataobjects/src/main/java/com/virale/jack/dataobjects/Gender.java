package com.virale.jack.dataobjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="GENDER")
public class Gender {
	
	@Id
	@Column(name="GENDER_ID")
	private int genderId;
	
	@Column(name="GENDER_NAME")
	private String gender;
	
	public int getGenderId() {
		return genderId;
	}
	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
