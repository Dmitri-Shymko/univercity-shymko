package com.belhard.univercity;

public class Teacher extends Employee {

	private Degree degree;
	private String courseName;
	private Group group;
	private NameOfDepartment nameOfDepartment;

	public Teacher(long id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	public Teacher(long id, String firstName, String lastName, Degree degree, String courseName, NameOfDepartment nameOfDepartment) {
		this(id, firstName, lastName);
		this.degree = degree;
		this.courseName = courseName;
		this.nameOfDepartment = nameOfDepartment;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
		return "Teacher: " + "\n\tDegree: " + degree + "\n\tCourse Name: " + courseName + "\n\tName Of Department: " + nameOfDepartment;
	}

}
