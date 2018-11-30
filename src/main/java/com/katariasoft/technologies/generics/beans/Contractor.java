package com.katariasoft.technologies.generics.beans;

public class Contractor extends Employee {

	private String originalCompanyName;
	private String oirginalCompanyAddress;

	public Contractor() {
	}

	public Contractor(String name, String phoneNo, String emailId, String id, String department,
			String educationalQualificartion, String dateOfJoining, String location, String originalCompanyName,
			String oirginalCompanyAddress) {
		super(name, phoneNo, emailId, id, department, educationalQualificartion, dateOfJoining, location);
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
