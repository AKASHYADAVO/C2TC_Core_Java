package com.tnsifDay3;

public class Address {
	private  String street;
	private String Landmark;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return Landmark;
	}
	public void setLandmark(String landmark) {
		Landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String city;
	public Address(String street, String landmark, String city) {
		super();
		this.street = street;
		Landmark = landmark;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", Landmark=" + Landmark + ", city=" + city + "]";
	}

	

}
