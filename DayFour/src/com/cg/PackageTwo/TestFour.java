package com.cg.PackageTwo;

import com.cg.Packageone.TestOne;

public class TestFour extends TestOne{
	public static void main(String[]args) {
		TestOne t4= new TestOne();
		System.out.println(t4.id);
		t4.display();
	}
}
