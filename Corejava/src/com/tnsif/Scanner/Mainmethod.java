package com.tnsif.Scanner;

import java.util.Scanner;

public class Mainmethod {

	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter person name");
		String name=sc.nextLine();
		System.out.println("enter person income");
		int income=sc.nextInt();
		
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcalcation t=new Taxcalcation();
		t.calucatateTax(pp);
		
		System.out.println("after calu tax");
		System.out.println(pp);
		
		
		
	}

}

