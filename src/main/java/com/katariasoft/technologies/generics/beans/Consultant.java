package com.katariasoft.technologies.generics.beans;

public class Consultant extends Employee {

	private String perHourRate;

	public Consultant() {
	}

	public Consultant(String name, String phoneNo, String emailId, String id, String department,
			String educationalQualificartion, String dateOfJoining, String location, String perHourRate) {
		super(name, phoneNo, emailId, id, department, educationalQualificartion, dateOfJoining, location);
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
