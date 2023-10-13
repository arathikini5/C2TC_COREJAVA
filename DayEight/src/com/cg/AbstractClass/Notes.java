package com.cg.AbstractClass;

public abstract class Notes {
	//Constructor
	public  Notes()
	{
		
	}
//Non abstract method	
void display() {
	System.out.println("Display Method");
}
	//Abstract method
abstract void show();

//abstract class
//1.abstract keyword
//2.Variable+methods +constructors
//3.Methods-abstract method and non abstract method
//if abstract method is present in a class its mandatory to make the class abstract
//cannot create object for(Instantiate) abstract class
}