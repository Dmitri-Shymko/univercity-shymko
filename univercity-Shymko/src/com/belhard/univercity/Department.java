package com.belhard.univercity;

public class Department {

	private NameOfDepartment nameOfDepartment;
	private long deparmentId;
	private int numberOfTeachers;
	private final Teacher[] teachers = new Teacher[8];
	private HeadOfDepartment headOfDeparment;
	private DeputyHeadOfDepartment deputyHeadOfDeparment;
	private Cleaner cleaner;

	public DeputyHeadOfDepartment getDeputyHeadOfDeparment() {
		return deputyHeadOfDeparment;
	}

	public void setDeputyHeadOfDeparment(DeputyHeadOfDepartment deputyHeadOfDeparment) {
		this.deputyHeadOfDeparment = deputyHeadOfDeparment;
	}

	public long getDeparmentId() {
		return deparmentId;
	}

	public void setDeparmentId(long deparmentId) {
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
		} else {
			teachersSalary = teachersSalary;
		}
		if (department.getDeputyHeadOfDeparment() != null) {
			teachersSalary = teachersSalary + AccountantUtil.bruttoSalaryPerMonth(deputyHeadOfDeparment);
		} else {
			teachersSalary = teachersSalary;
		}
		if (department.getCleaner() != null) {
			teachersSalary = teachersSalary + AccountantUtil.bruttoSalaryPerMonth(cleaner);
		} else {
			teachersSalary = teachersSalary;
		}
		System.out.println("\n\tDepartment month costs is: " + teachersSalary);
	}

}
