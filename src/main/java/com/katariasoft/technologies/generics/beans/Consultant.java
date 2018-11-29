package com.katariasoft.technologies.generics.beans;

public class Consultant extends Employee {

	private String perHourRate;

	public Consultant() {
	}

	public Consultant(String name, String fathersName, String mothersName, String adhaarNo, String address, String city,
			String pinCode, String state, String country, String phoneNo, String emailId, String id, String department,
			String educationalQualificartion, String dateOfJoining, String perHourRate) {
		super(name, fathersName, mothersName, adhaarNo, address, city, pinCode, state, country, phoneNo, emailId, id,
				department, educationalQualificartion, dateOfJoining);
		this.perHourRate = perHourRate;
		// TODO Auto-generated constructor stub
	}

	public String getPerHourRate() {
		return perHourRate;
	}

	public void setPerHourRate(String perHourRate) {
		this.perHourRate = perHourRate;
	}

}
