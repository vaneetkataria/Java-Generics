package com.katariasoft.technologies.generics.beans;

public class Person {

	private String name;
	private String phoneNo;
	private String emailId;

	public Person() {
	}

	public Person(String name, String phoneNo, String emailId) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
	}

}
