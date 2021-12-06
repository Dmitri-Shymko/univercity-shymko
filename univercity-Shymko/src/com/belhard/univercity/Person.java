package com.belhard.univercity;

import java.util.Objects;

public abstract class Person implements Identifiable {

	private long id;
	private String firstName;
	private String lastName;
	private Address address;
	private DateOfBirth dateOfBirth;

	public Person(long id, String firstName, String lastName) {
//		id = (long) (Math.random() * Long.MAX_VALUE);
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public abstract void introduceYourself();

	@Override
	public int hashCode() {
		return Objects.hash(address, dateOfBirth, firstName, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName);
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return "\n\tid: " + id + "\n\tFirst Name: " + firstName + "\n\tLast Name: " + lastName + "\n\tAddress: "
				+ address + "\n\tDate Of Birth: " + dateOfBirth;
	}

}
