package com.belhard.univercity;

public class Teacher {
	
	private Personal personal;
	private Address address;
	private double salary;
	
	public boolean setSalary(double salary) {
		if (salary > 0.0) {
			this.salary = salary;
			return true;
		}
		return false;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	
	public Personal getPersonal() {
		return personal;
	}
	
	public String toString() {
		return "Teacher: " + "\n\tPersonal data: " + personal + "\n\tAddress: " + address + "\n\tSalary: " + salary;
	}

}
