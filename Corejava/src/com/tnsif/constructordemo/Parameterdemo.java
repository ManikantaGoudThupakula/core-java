package com.tnsif.constructordemo;

public class Parameterdemo {
	 
	Parameterdemo(){
		System.out.println("Default");
	}
	Parameterdemo(int a){
		System.out.println("One parameter");
	}
	Parameterdemo(int a,String b){
		System.out.println("Two parameter");
	}
	
	public static void main(String[] args) {
		Parameterdemo d = new Parameterdemo();
		Parameterdemo d1 = new Parameterdemo(5, "Mani");
		Parameterdemo d2 = new Parameterdemo(11);
	}
}
