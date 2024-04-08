package com.tnsifDay3;

public class Executor {
	public static void main(String args []) {
		
		Address obj = new Address("colaba","lamp", "mumbai");
		
		Person p = new Person("akash",obj);
		
		System.out.println(p);		
		
	}

	
}
