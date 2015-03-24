package com.virale.jack.dataobjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CARDSTORE_CITIES")
public class City {
	@Id
	@Column(name="CITY_ID")
	private int cityId;
	
	@Column(name="CITY_NAME")
	private String cityName;
	
	@ManyToOne
	@JoinColumn(name="stateId",referencedColumnName="STATE_ID")
	private State state;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
