package com.tnsifday2;
import java.util.Scanner;

public class Excutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter customer id:");
        int id=sc.nextInt();
        
        sc.nextLine();
        System.out.println("enter customer name:");
        String name=sc.nextLine();
        
        System.out.println("enter customer city:");
        String city=sc.nextLine();
        
      //  Customers c1 = new Customers();
        
      //  c1.setCustomerId(id);
      //  c1.setCustomerCity(name);
      // c1.setCustomerName(city);
        
      //  System.out.println("Customers Details: " +c1);
        
        
        Customers c2 = new Customers(id,name,city);
        System.out.println(c2);
        
	}

}
