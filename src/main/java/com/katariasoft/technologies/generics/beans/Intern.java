package com.katariasoft.technologies.generics.beans;

public class Intern extends Employee {

	private String internshipStartDate;
	private String internshipEndDate;

	public Intern() {
	}

	public Intern(String name, String fathersName, String mothersName, String adhaarNo, String address, String city,
			String pinCode, String state, String country, String phoneNo, String emailId, String id, String department,
			String educationalQualificartion, String dateOfJoining, String internshipStartDate,
			String internshipEndDate) {
		super(name, fathersName, mothersName, adhaarNo, address, city, pinCode, state, country, phoneNo, emailId, id,
				department, educationalQualificartion, dateOfJoining);
		this.internshipStartDate = internshipStartDate;
		this.internshipEndDate = internshipEndDate;
	}

	public String getInternshipStartDate() {
		return internshipStartDate;
	}

	public void setInternshipStartDate(String internshipStartDate) {
		this.internshipStartDate = internshipStartDate;
	}

	public String getInternshipEndDate() {
		return internshipEndDate;
	}

	public void setInternshipEndDate(String internshipEndDate) {
		this.internshipEndDate = internshipEndDate;
	}

}
