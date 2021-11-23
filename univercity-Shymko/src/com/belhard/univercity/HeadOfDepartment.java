package com.belhard.univercity;

public class HeadOfDepartment extends Employee {

	private Degree degree;
	private NameOfDepartment nameOfDepartment;

	public HeadOfDepartment(long id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}
	
	public HeadOfDepartment(long id, String firstName, String lastName, Degree degree, NameOfDepartment nameOfDepartment) {
		this(id, firstName, lastName);
		this.degree = degree;
		this.nameOfDepartment = nameOfDepartment;
	}
	
	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	public NameOfDepartment getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(NameOfDepartment nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	@Override
	public String toString() {
		return "HeadOfDepartment: " + nameOfDepartment + "\n\tDegree: " + degree;
	}

}
