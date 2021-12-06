package com.belhard.univercity;

public abstract class Employee extends Person {

	private double salary;
	private NameOfDepartment nameOfDepartment;
	private Position position;
	private int workExperience;
	private int workedHours;
	private int vacationDays;

	public Employee(long id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	public Employee(long id, String firstName, String lastName, NameOfDepartment nameOfDepartment, Position position) {
		this(id, firstName, lastName);
		this.nameOfDepartment = nameOfDepartment;
		this.position = position;
	}

	public Employee(long id, String firstName, String lastName, double salary, int workExperience, int workedHours,
			int vacationDays) {
		this(id, firstName, lastName);
		this.salary = salary;
		this.workExperience = workExperience;
		this.workedHours = workedHours;
		this.vacationDays = vacationDays;
	}

	public Employee(long id, String firstName, String lastName, NameOfDepartment nameOfDepartment, Position position, double salary,
			int workExperience, int workedHours, int vacationDays) {
		this(id, firstName, lastName);
		this.nameOfDepartment = nameOfDepartment;
		this.position = position;
		this.salary = salary;
		this.workExperience = workExperience;
		this.workedHours = workedHours;
		this.vacationDays = vacationDays;
	}

	public NameOfDepartment getDepartment() {
		return nameOfDepartment;
	}

	public void setDepartment(NameOfDepartment nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public boolean setSalary(double salary) {
		if (salary > 0.0) {
			this.salary = salary;
			return true;
		}
		return false;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee: " + "\n\tSalary: " + salary + "\n\tDepartment: " + nameOfDepartment + "\n\tPosition: " + position
				+ "\n\tWork experience: " + workExperience + "\n\tWorked hours: " + workedHours + "\n\tVacation days: "
				+ vacationDays;
	}

}
