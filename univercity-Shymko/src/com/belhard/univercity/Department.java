package com.belhard.univercity;

import com.belhard.univercity.datastructures.MyCollection;
import com.belhard.univercity.datastructures.MyDynamicArray;

public class Department implements Identifiable {

	private NameOfDepartment nameOfDepartment;
	private long deparmentId;
	private int maxCapacity = 8;
	private final MyCollection teachers = new MyDynamicArray();
	private HeadOfDepartment headOfDeparment;
	private DeputyHeadOfDepartment deputyHeadOfDeparment;
	private Cleaner cleaner;

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + Arrays.hashCode(teachers);
//		result = prime * result + Objects.hash(cleaner, deparmentId, deputyHeadOfDeparment, headOfDeparment,
//				nameOfDepartment, numberOfTeachers);
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Department other = (Department) obj;
//		return Objects.equals(cleaner, other.cleaner) && deparmentId == other.deparmentId
//				&& Objects.equals(deputyHeadOfDeparment, other.deputyHeadOfDeparment)
//				&& Objects.equals(headOfDeparment, other.headOfDeparment) && nameOfDepartment == other.nameOfDepartment
//				&& numberOfTeachers == other.numberOfTeachers && Arrays.equals(teachers, other.teachers);
//	}

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
		return (Teacher[]) teachers.toArray();
	}

	public boolean addTeachers(Teacher teacher) {
		if (getNumberOfTeachers() < maxCapacity) {
			teachers.add(teacher);
			return true;
		}
		return false;

	}

	public boolean removeTeacher(Teacher teacher) {
		return teachers.remove(teacher);
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
		return teachers.size();
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
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
