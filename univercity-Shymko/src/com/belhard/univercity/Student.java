package com.belhard.univercity;

public class Student {
	
	private String faculty;
	private String groupNumber;
	private double scholarship;
	private Address address;
	private Personal personal;
	
	public Student(String faculty, String groupNumber, double scholarship) {
		this.faculty = faculty;
		this.groupNumber = groupNumber;
		this.scholarship = scholarship;
	}
	
	public boolean setScholarship(double scholarship) {
		if (scholarship > 0.0) {
			this.scholarship = scholarship;
			return true;
		}
		return false;
	}
	
	public double getScolarship() {
		return scholarship;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}
	
	public String getGroupNumber() {
		return groupNumber;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	
	public Personal getPersonal() {
		return personal;
	}
	
	public String toString() {
		return "Student: "  + personal  + "\n\tAddress: " + address + "\n\tFaculty: " + faculty + "\n\tGroup number: " + groupNumber + "\n\tScholarship: " + scholarship;
	}

}
