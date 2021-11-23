package com.belhard.univercity;

public class App {

	public static void main(String[] args) {

		Group group = new Group();

		Student student1 = new Student(1, "Kile", "Reavese", Faculty.MATEMATICS, 29.0, 9.0);
		Student student2 = new Student(2, "Jone", "Wuiq", Faculty.MATEMATICS, 36.0, 8.0);
		Student student3 = new Student(3, "Larry", "Kraft", Faculty.MATEMATICS, 27.0, 5.0);
		Student student4 = new Student(4, "King", "Big", Faculty.MATEMATICS, 54.0, 10.0);

		group.addStudents(student1);
		group.addStudents(student2);
		group.addStudents(student3);
		group.addStudents(student4);
		Util.printStudentList(group);

		group.removeStudent(student1.getId());
		Util.printStudentList(group);
		System.out.println("\n\tGroup size: " + group.getNumberOfStudents());

		double result = group.getGroupAverageScore();
		System.out.println("\n\tGroup score: " + result);
		group.printAvailablePlaces();

		Department department = new Department();

		Teacher teach1 = new Teacher(1, "Dany", "Devito");
		Teacher teach2 = new Teacher(2, "Yriy", "Gridnev");
		Teacher teach3 = new Teacher(3, "Don", "Carlione");
		Teacher teach4 = new Teacher(4, "None", "Zavizion");
		Teacher teach5 = new Teacher(5, "Krutoi", "Perec");

		HeadOfDepartment head = new HeadOfDepartment(6, "Rod", "Styarrt");
		DeputyHeadOfDepartment deputyHead = new DeputyHeadOfDepartment(7, "Katia", "Shtalina");
		
		Cleaner cleaner = new Cleaner(8, "Matt", "Damon");
		
		teach1.setSalary(1200);
		teach2.setSalary(1200);
		teach3.setSalary(1400);
		teach4.setSalary(1200);
		teach5.setSalary(1200);
		
		head.setSalary(2000);
		deputyHead.setSalary(2000);
		cleaner.setSalary(600);
		
		teach1.setWorkExperience(1);
		teach2.setWorkExperience(7);
		teach3.setWorkExperience(5);
		teach4.setWorkExperience(11);
		teach5.setWorkExperience(2);
		
		head.setWorkExperience(8);
		deputyHead.setWorkExperience(12);
		cleaner.setWorkExperience(0);
		
		department.addTeachers(teach1);
		department.addTeachers(teach2);
		department.addTeachers(teach3);
		department.addTeachers(teach4);
		department.addTeachers(teach5);
		
//		department.setHeadOfDeparment(head);
		department.setDeputyHeadOfDeparment(deputyHead);
		department.setCleaner(cleaner);
		
//		department.setCleaner(null);
		
//		department.departmentMonthCosts(department);
		Util.printDepartmentList(department);

	}

}
