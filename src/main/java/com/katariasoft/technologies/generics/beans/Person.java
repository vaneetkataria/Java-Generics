package com.katariasoft.technologies.generics.beans;

public class Person {

	private String name;
	private String fathersName;
	private String mothersName;
	private String adhaarNo;
	private String address;
	private String city;
	private String pinCode;
	private String state;
	private String country;
	private String phoneNo;
	private String emailId;

	public Person() {
	}

	public Person(String name, String fathersName, String mothersName, String adhaarNo, String address, String city,
			String pinCode, String state, String country, String phoneNo, String emailId) {
		super();
		this.name = name;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.adhaarNo = adhaarNo;
		this.address = address;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.country = country;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(String adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
