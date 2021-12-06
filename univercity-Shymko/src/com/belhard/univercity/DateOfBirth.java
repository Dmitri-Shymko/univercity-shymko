package com.belhard.univercity;

import java.util.Objects;

public class DateOfBirth {

	private int yearOfBirth;
	private Month monthOfBirth;
	private int dayOfBirth;

	public DateOfBirth(int dayOfBirth, Month monthOfBirth, int yearOfBirth) {
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dayOfBirth, monthOfBirth, yearOfBirth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateOfBirth other = (DateOfBirth) obj;
		return dayOfBirth == other.dayOfBirth && monthOfBirth == other.monthOfBirth && yearOfBirth == other.yearOfBirth;
	}

	public boolean setYearOfBirth(int yearOfBirth) {
		if (yearOfBirth > 1900 && yearOfBirth < 2021) {
			this.yearOfBirth = yearOfBirth;
			return true;
		}
		return false;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setMonthOfBirth(Month monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public Month getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	@Override
	public String toString() {
		return "\n\tDate of birth is: " + dayOfBirth + "\t" + monthOfBirth + "\t" + yearOfBirth;
	}

}
