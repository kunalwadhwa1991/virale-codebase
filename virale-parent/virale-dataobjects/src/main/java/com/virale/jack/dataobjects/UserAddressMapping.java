package com.virale.jack.dataobjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ADDRESS_MAPPING")
public class UserAddressMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAPPING_ID")
	private int mappingId;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private CardStoreUser user;

	@ManyToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	public int getMappingId() {
		return mappingId;
	}

	public void setMappingId(int mappingId) {
		this.mappingId = mappingId;
	}

	public CardStoreUser getUser() {
		return user;
	}

	public void setUser(CardStoreUser user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
