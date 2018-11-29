package com.katariasoft.technologies.generics.beans;

public class Contractor extends Employee {

	private String originalCompanyName;
	private String oirginalCompanyAddress;

	public Contractor() {
	}

	public Contractor(String name, String fathersName, String mothersName, String adhaarNo, String address, String city,
			String pinCode, String state, String country, String phoneNo, String emailId, String id, String department,
			String educationalQualificartion, String dateOfJoining, String originalCompanyName,
			String oirginalCompanyAddress) {
		super(name, fathersName, mothersName, adhaarNo, address, city, pinCode, state, country, phoneNo, emailId, id,
				department, educationalQualificartion, dateOfJoining);
		this.originalCompanyName = originalCompanyName;
		this.oirginalCompanyAddress = oirginalCompanyAddress;

		// TODO Auto-generated constructor stub
	}

	public String getOriginalCompanyName() {
		return originalCompanyName;
	}

	public void setOriginalCompanyName(String originalCompanyName) {
		this.originalCompanyName = originalCompanyName;
	}

	public String getOirginalCompanyAddress() {
		return oirginalCompanyAddress;
	}

	public void setOirginalCompanyAddress(String oirginalCompanyAddress) {
		this.oirginalCompanyAddress = oirginalCompanyAddress;
	}

}
