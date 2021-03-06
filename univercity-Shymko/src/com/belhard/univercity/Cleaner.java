package com.belhard.univercity;

public class Cleaner extends Employee {

	private AreaOfResponsobility areaOfResponsobility;

	public Cleaner(long id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	public Cleaner(long id, String firstName, String lastName, AreaOfResponsobility areaOfResponsobility) {
		this(id, firstName, lastName);
		this.areaOfResponsobility = areaOfResponsobility;
	}

	public AreaOfResponsobility getAreaOfResponsobility() {
		return areaOfResponsobility;
	}

	public void setAreaOfResponsobility(AreaOfResponsobility areaOfResponsobility) {
		this.areaOfResponsobility = areaOfResponsobility;
	}

	@Override
	public String toString() {
		return "Cleaner: " + "\n\tArea of Responsobility: " + areaOfResponsobility;
	}

	@Override
	public void introduceYourself() {
		System.out.printf(
				"Hello my name is %s %s. I'm cleaner of %s department. I like my job because my salary is %f.",
				getFirstName(), getLastName(), getDepartment(), getSalary());

	}

}
