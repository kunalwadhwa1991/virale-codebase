package com.virale.jack.dataobjects;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CARDSTORE_COUNTRIES")
public class Country {
	
	@Id
	@Column(name="COUNTRY_ID")
	private int countryId;
	
	@Column(name="COUNTRY_NAME")
	private String countryName;
	
	@OneToMany(mappedBy="country", cascade=CascadeType.PERSIST)
	private Set<State> states;
	
	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Set<State> getStates() {
		return states;
	}

	public void setStates(Set<State> states) {
		this.states = states;
	}

}
