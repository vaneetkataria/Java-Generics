package com.katariasoft.technologies.generics.beans;

public class PermanentEmployee extends Employee {

	private String dateOfConfirmation;
	private String confirmationNo;
	private String companyEmailId;
	private String accessCardNo;

	public PermanentEmployee() {
	}

	public PermanentEmployee(String name, String phoneNo, String emailId, String id, String department,
			String educationalQualificartion, String dateOfJoining, String location, String dateOfConfirmation,
			String confirmationNo, String companyEmailId, String accessCardNo) {
		super(name, phoneNo, emailId, id, department, educationalQualificartion, dateOfJoining, location);
		this.dateOfConfirmation = dateOfConfirmation;
		this.confirmationNo = confirmationNo;
		this.companyEmailId = companyEmailId;
		this.accessCardNo = accessCardNo;
	}

	public String getDateOfConfirmation() {
		return dateOfConfirmation;
	}

	public void setDateOfConfirmation(String dateOfConfirmation) {
		this.dateOfConfirmation = dateOfConfirmation;
	}

	public String getConfirmationNo() {
		return confirmationNo;
	}

	public void setConfirmationNo(String confirmationNo) {
		this.confirmationNo = confirmationNo;
	}

	public String getCompanyEmailId() {
		return companyEmailId;
	}

	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}

	public String getAccessCardNo() {
		return accessCardNo;
	}

	public void setAccessCardNo(String accessCardNo) {
		this.accessCardNo = accessCardNo;
	}

}
