package com.belhard.univercity;

import com.belhard.univercity.datastructures.MyCollection;
import com.belhard.univercity.datastructures.MyDynamicArray;

public class Group implements Identifiable {

	private long groupId;
	private final MyCollection<Student> students = new MyDynamicArray();
	private Teacher teacher;
	private double groupAverageScore;
	private int maxCapacity = 8;

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + Arrays.hashCode(students);
//		result = prime * result + Objects.hash(groupAverageScore, groupId, numberOfStudents, teacher);
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
//		Group other = (Group) obj;
//		return Double.doubleToLongBits(groupAverageScore) == Double.doubleToLongBits(other.groupAverageScore)
//				&& groupId == other.groupId && numberOfStudents == other.numberOfStudents
//				&& Arrays.equals(students, other.students) && Objects.equals(teacher, other.teacher);
//	}
	
	
	public long getId() {
		return groupId;
	}

	public void setId(long groupId) {
		this.groupId = groupId;
	}

	public Student[] getStudent() {
		return students.toArray(Student.class);
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public boolean addStudents(Student student) {
		if (getNumberOfStudents() < maxCapacity) {
			students.add(student);
			return true;
		}
		return false;

	}

	public boolean removeStudent(Student student) {
		return students.remove(student);
	}

	public double getGroupAverageScore() {
		double result = 0;
		for (int i = 0; i < students.size(); i++) {
//			Student[] students = new Student[8];
			groupAverageScore += getStudent()[i].getAverageScore();
		}
		if (students.size() != 0) {
		result = groupAverageScore / students.size();
		}
		return result;
	}

	public int availablePlaces() {
		int places = maxCapacity - students.size();
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

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

}
