package com.tnsif.staticprograms;

public class Employee {

	int eid;
	String name;
	static String Companyname = "Deloitte";
	
	
	Employee (int id, String n){
		
		eid=id;
		name=n;
		
		
		
	}
	
	void display() {
		System.out.println(eid+ " "+name+" "+Companyname);
	}
	public static void main(String[] args) {
		Employee e1 =new Employee(1,"Chatrika");
		Employee e2 =new Employee(2,"Manikanta");


		e1.display();
		e2.display();
		
	}
	
	
}	


