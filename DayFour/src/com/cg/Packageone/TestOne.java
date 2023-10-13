package com.cg.Packageone;

public class TestOne {
	public int id=5;
	public void display() {
		System.out.println("Access Modifiers");
	}
	public static void main(String[] args) {
		TestOne t1= new TestOne();
		System.out.println(t1.id);
		t1.display();
	}

}