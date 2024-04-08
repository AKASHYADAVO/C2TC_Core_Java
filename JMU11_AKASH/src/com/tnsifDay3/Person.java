package com.tnsifDay3;
// "have A " relationship
public class Person {

	private String name;
	private Address address;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}



	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
 void display() {
	 System.out.println("");
 }
}
