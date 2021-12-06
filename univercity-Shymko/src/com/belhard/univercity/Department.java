package com.belhard.univercity;

import java.util.Arrays;
import java.util.Objects;

public class Department implements Identifiable {

	private NameOfDepartment nameOfDepartment;
	private long deparmentId;
	private int numberOfTeachers;
	private final Teacher[] teachers = new Teacher[8];
	private HeadOfDepartment headOfDeparment;
	private DeputyHeadOfDepartment deputyHeadOfDeparment;
	private Cleaner cleaner;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(teachers);
		result = prime * result + Objects.hash(cleaner, deparmentId, deputyHeadOfDeparment, headOfDeparment,
				nameOfDepartment, numberOfTeachers);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(cleaner, other.cleaner) && deparmentId == other.deparmentId
				&& Objects.equals(deputyHeadOfDeparment, other.deputyHeadOfDeparment)
				&& Objects.equals(headOfDeparment, other.headOfDeparment) && nameOfDepartment == other.nameOfDepartment
				&& numberOfTeachers == other.numberOfTeachers && Arrays.equals(teachers, other.teachers);
	}

	public DeputyHeadOfDepartment getDeputyHeadOfDeparment() {
		return deputyHeadOfDeparment;
	}

	public void setDeputyHeadOfDeparment(DeputyHeadOfDepartment deputyHeadOfDeparment) {
		this.deputyHeadOfDeparment = deputyHeadOfDeparment;
	}

	public long getId() {
		return deparmentId;
	}

	public void setId(long deparmentId) {
		this.deparmentId = deparmentId;
	}

	public NameOfDepartment getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(NameOfDepartment nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	public Teacher[] getTeacher() {
		Teacher[] copy = new Teacher[teachers.length];
		for (int i = 0; i < teachers.length; i++) {
			copy[i] = teachers[i];
		}
		return copy;
	}

	public boolean addTeachers(Teacher teacher) {
		if (numberOfTeachers < teachers.length) {
			teachers[numberOfTeachers++] = teacher;
			return true;
		}
		return false;

	}

	public boolean removeTeacher(long id) {
		boolean isDelited = false;
		int initialNumber = numberOfTeachers;
		for (int i = 0; i < initialNumber; i++) {
			if (!isDelited && teachers[i].getId() == id) {
				teachers[i] = null;
				numberOfTeachers--;
				isDelited = true;
			}
			if (isDelited && i < teachers.length - 1) {
				teachers[i] = teachers[i + 1];
			}
			if (isDelited && i == teachers.length - 1) {
				teachers[i] = null;
			}

		}
		return false;
	}

	public HeadOfDepartment getHeadOfDeparment() {
		return headOfDeparment;
	}

	public void setHeadOfDeparment(HeadOfDepartment headOfDeparment) {
		this.headOfDeparment = headOfDeparment;
	}

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}

	public int getNumberOfTeachers() {
		return numberOfTeachers;
	}

	public void setNumberOfTeachers(int numberOfTeachers) {
		this.numberOfTeachers = numberOfTeachers;
	}

	public void departmentMonthCosts(Department department) {
		double teachersSalary = 0;
		Teacher teachers[] = department.getTeacher();
		for (int i = 0; i < department.getNumberOfTeachers(); i++) {
			teachersSalary += AccountantUtil.bruttoSalaryPerMonth(teachers[i]);
		}
		if (department.getHeadOfDeparment() != null) {
			teachersSalary = teachersSalary + AccountantUtil.bruttoSalaryPerMonth(headOfDeparment);
		}
		if (department.getDeputyHeadOfDeparment() != null) {
			teachersSalary = teachersSalary + AccountantUtil.bruttoSalaryPerMonth(deputyHeadOfDeparment);
		}
		if (department.getCleaner() != null) {
			teachersSalary = teachersSalary + AccountantUtil.bruttoSalaryPerMonth(cleaner);
		}
		System.out.println("\n\tDepartment month costs is: " + teachersSalary);
	}

}
