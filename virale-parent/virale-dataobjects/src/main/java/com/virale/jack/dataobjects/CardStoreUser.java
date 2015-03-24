package com.virale.jack.dataobjects;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CARDSTORE_MEMBERS_INFO")
public class CardStoreUser {

	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "PASSWORD_HASH")
	private String password;
	@Column(name = "NAME")
	private String fullName;

	@Column(name = "EMAIL_ADDRESS")
	private String emailId;

	@Column(name = "PHONE")
	private String phone;

	@Column(name = "MOBILE_NUMBER")
	private String mobile;

	@Column(name = "IS_ACTIVE")
	private String isActive;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_DATE")
	private Date updateDate;

	@Column(name = "IS_ADMIN")
	private String isAdmin;

	// bi directional one to many mapping
	@OneToMany(mappedBy = "user")
	private Set<UserAddressMapping> userAddressMappings;

	// uni directional one to one mapping
	@OneToOne(cascade = CascadeType.MERGE)
	@PrimaryKeyJoinColumn
	private Gender gender;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Set<UserAddressMapping> getUserAddressMappings() {
		return userAddressMappings;
	}

	public void setUserAddressMappings(
			Set<UserAddressMapping> userAddressMappings) {
		this.userAddressMappings = userAddressMappings;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
