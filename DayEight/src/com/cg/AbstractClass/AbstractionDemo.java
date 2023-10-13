package com.cg.AbstractClass;

public class AbstractionDemo {

	public static void main(String[] args) {
		Square s=new Square();
		s.side=5;
		//s.calcArea();
		//s.show();
		System.out.println(s.calcArea());
	}

}
