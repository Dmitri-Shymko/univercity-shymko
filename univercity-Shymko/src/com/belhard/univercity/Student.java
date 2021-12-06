package com.belhard.univercity;

public class Student extends Person {

	private Faculty faculty;
	private Group group;
	private double scholarship;
	private double averageScore;

	public Student(long id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	public Student(long id, String firstName, String lastName, Faculty faculty, double scholarship,
			double averageScore) {
		this(id, firstName, lastName);
		this.faculty = faculty;
		this.scholarship = scholarship;
		this.averageScore = averageScore;
	}

	public Student(long id, String firstName, String lastName, double averageScore) {
		this(id, firstName, lastName);
		this.averageScore = averageScore;
	}

	public boolean setAverageScore(double averageScore) {
		if (averageScore > 0.0 && averageScore <= 10.0) {
			this.averageScore = averageScore;
			return true;
		}
		System.out.println("Please set correct value!");
		return false;

	}

	public double getAverageScore() {
		return averageScore;
	}

	public boolean setScholarship(double scholarship) {
		if (scholarship > 0.0) {
			this.scholarship = scholarship;
			return true;
		}
		return false;
	}

	public double getScolarship() {
		return scholarship;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student: " + "\n\tFaculty: " + faculty + "\n\tScholarship: " + scholarship;
	}

	@Override
	public void introduceYourself() {
		System.out.printf("Hello my name is %s %s. I'm student of %s faculty. And my average score is %f.",
				getFirstName(), getLastName(), getFaculty(), getAverageScore());

	}

}
