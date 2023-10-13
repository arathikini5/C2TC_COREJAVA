package com.cg.AbstractClass;
//Abstract class
public abstract class Shape {

	float area;
	//abstract void calcArea();
	abstract float calcArea();
	void show()
	{
		System.out.println("Area of Shape"+area);
	}
}
