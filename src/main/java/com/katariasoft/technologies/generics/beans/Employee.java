package com.katariasoft.technologies.generics.beans;

public class Employee extends Person {

	private String id;
	private String department;
	private String educationalQualificartion;
	private String dateOfJoining;
	private String location;

	public Employee() {
	}

	public Employee(String name, String phoneNo, String emailId, String id, String department,
			String educationalQualificartion, String dateOfJoining, String location) {
		super(name, phoneNo, emailId);
		this.id = id;
		this.department = department;
		this.educationalQualificartion = educationalQualificartion;
		this.dateOfJoining = dateOfJoining;
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEducationalQualificartion() {
		return educationalQualificartion;
	}

	public void setEducationalQualificartion(String educationalQualificartion) {
		this.educationalQualificartion = educationalQualificartion;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
