package com.cg.PackageTwo;

import com.cg.Packageone.TestOne;

public class TestThree extends TestOne{

	public static void main(String[] args) {
		TestOne t3= new TestOne();
		System.out.println(t3.id);
		t3.display();
	}

}
