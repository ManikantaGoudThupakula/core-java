package com.tnsif.constructordemo;

import java.util.Scanner;

public class Constructordemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the customer name:");
		String name = sc.next();
		
		System.out.println("Enter the Customer id:");
		int id = sc.nextInt();
		
		System.out.println("Enter the Customer address:");
		String address = sc.next();
		
		Customer c = new Customer();
		
		c.setCustomername(name);
		c.setCustomerid(id);
		c.setCustomeradreess(address);
		
		System.out.println(c);
	}
	
}
