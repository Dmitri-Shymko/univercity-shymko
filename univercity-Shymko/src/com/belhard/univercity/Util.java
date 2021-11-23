package com.belhard.univercity;

public class Util {

	public static void printStudentList(Group group) {
		Student students[] = group.getStudent();
		System.out.println("\nStudents of your group are: ");
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (student == null) {
				break;
			}
			System.out.print("\n\tStudent # " + (i + 1) + "\n\t\tFirst name:  " + student.getFirstName()
					+ "\n\t\tLast name: " + student.getLastName());
		}
	}

	public static void printTeacherList(Department department) {
		Teacher teachers[] = department.getTeacher();
		System.out.println("\nTeachers of your department are: ");
		for (int i = 0; i < teachers.length; i++) {
			Teacher teacher = teachers[i];
			if (teacher == null) {
				break;
			}
			System.out.print("\n\tTeacher # " + (i + 1) + "\n\t\tFirst name:  " + teacher.getFirstName()
					+ "\n\t\tLast name: " + teacher.getLastName());
		}
	}

	public static void printDepartmentList(Department department) {
		Teacher teachers[] = department.getTeacher();
		HeadOfDepartment headOfDepartment = department.getHeadOfDeparment();
		DeputyHeadOfDepartment deputyHeadOfDepartment = department.getDeputyHeadOfDeparment();
		Cleaner cleaner = department.getCleaner();
		if (headOfDepartment != null) {
			System.out.println("\nHead of department: " + "\n\t\tFirst name:  " + headOfDepartment.getFirstName()
					+ "\n\t\tLast name: " + headOfDepartment.getLastName());
		}
		if (deputyHeadOfDepartment != null) {
			System.out.println("\nDeputy head of department: " + "\n\t\tFirst name:  "
					+ deputyHeadOfDepartment.getFirstName() + "\n\t\tLast name: " + deputyHeadOfDepartment.getLastName());
		}
		System.out.println("\nTeachers of your department are: ");
		for (int i = 0; i < teachers.length; i++) {
			Teacher teacher = teachers[i];
			if (teacher == null) {
				break;
			}
			System.out.print("\n\tTeacher # " + (i + 1) + "\n\t\tFirst name:  " + teacher.getFirstName()
					+ "\n\t\tLast name: " + teacher.getLastName());
		}
		if (cleaner != null) {
			System.out.println("\nDepartment cleaner: " + "\n\t\tFirst name:  " + cleaner.getFirstName()
					+ "\n\t\tLast name: " + cleaner.getLastName());
		}
	}
}
