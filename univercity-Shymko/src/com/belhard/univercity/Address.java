package com.belhard.univercity;

import java.util.Objects;

public class Address {
	private Country country;
	private String city;
	private String street;
	private int houseNumber;
	private int flatNumber;
	private String block;
	
	public Address(Country country, String city, String street, int houseNumber) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
	}
	
	public Address(Country country, String city, String street, int houseNumber, String block) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
		this.block = block;
	}
	
	public Address(Country country, String city, String street, int houseNumber, int flatNumber) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
		this.flatNumber = flatNumber;
	}
	
	public Address(Country country, String city, String street, int houseNumber, int flatNumber, String block) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
		this.flatNumber = flatNumber;
		this.block = block;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(block, city, country, flatNumber, houseNumber, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(block, other.block) && Objects.equals(city, other.city) && country == other.country
				&& flatNumber == other.flatNumber && houseNumber == other.houseNumber
				&& Objects.equals(street, other.street);
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	public Country getCountry() {
		return country;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	
	public int getFlatNumber() {
		return flatNumber;
	}
	
	public void setBlockNumber(String block) {
		this.block = block;
	}
	
	public String getBlockNumber() {
		return block;
	}
	
	@Override
	public String toString() {
		String str = country + ", " + city + ", " + street + ", " + houseNumber;
		if ( block != null) {
			str += ", " + block;
		}
		if (flatNumber != 0) {
			str += ", apt: " + flatNumber;
		}
		return str;
	}

}
