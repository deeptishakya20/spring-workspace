package com.capgemini.spring.organization;

public class Address {
	
	
	String addressLine;
	String city;
	String street;

		public Address(String addressLine, String city, String street) {
		
		this.addressLine = addressLine;
		this.city = city;
		this.street = street;
	}

	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + " , city=" + city + " , street=" + street + "]";
	}							

								

}
