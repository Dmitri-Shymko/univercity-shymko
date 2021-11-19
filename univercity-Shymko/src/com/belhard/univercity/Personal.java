package com.belhard.univercity;

public class Personal {
	
	private long id;
	private String firstName;
	private String lastName;
	
	public Personal(String firstName, String lastName) {
		id = (long) (Math.random() * Long.MAX_VALUE);
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	public String toString() {
		return "\n\tid: " + id + "\n\tFirst Name: " + firstName + "\n\tLast Name: " + lastName ;
	}

}
