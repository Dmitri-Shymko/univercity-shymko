package com.belhard.univercity;

public class Group {

	private long groupId;
	private final Student[] students = new Student[8];
	private Teacher teacher;
	private int numberOfStudents;
	private double groupAverageScore;

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public Student[] getStudent() {
		Student[] copy = new Student[students.length];
		for (int i = 0; i < students.length; i++) {
			copy[i] = students[i];
		}
		return copy;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public boolean addStudents(Student student) {
		if (numberOfStudents < students.length) {
			students[numberOfStudents++] = student;
			return true;
		}
		return false;

	}

	public boolean removeStudent(long id) {
		boolean isDelited = false;
		int initialNumber = numberOfStudents;
		for (int i = 0; i < initialNumber; i++) {
			if (!isDelited && students[i].getId() == id) {
				students[i] = null;
				numberOfStudents--;
				isDelited = true;
			}
			if (isDelited && i < students.length - 1) {
				students[i] = students[i + 1];
			}
			if (isDelited && i == students.length - 1) {
				students[i] = null;
			}

		}
		return false;
	}

	public double getGroupAverageScore() {
		for (int i = 0; i < numberOfStudents; i++) {
			groupAverageScore += students[i].getAverageScore();
		}
		return groupAverageScore / numberOfStudents;
	}

	public int availablePlaces() {
		int places = students.length - numberOfStudents;
		return places;
	}
	
	public void printAvailablePlaces() {
		System.out.println("\nNumber of available places in the group: " + availablePlaces());
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
