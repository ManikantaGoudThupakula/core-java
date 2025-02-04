package com.tnsif.superkeyword;

public class Customer {

	int id;
	String name;
	static String Address="knr";
	
	static void change() {
		Address="hyd";
		
	}
	
	Customer(int i,String n){
		
		id=i;
		name=n;		
	}
	
	void display() {
		System.out.println(id+ " "+name+ " "+Address);
	}
	public static void main(String[] args) {
		Customer.change();
		Customer c1=new Customer(1,"Chikku");
		Customer c2=new Customer(2,"Mani");
		
		c1.display();
		c2.display();
	}
}
