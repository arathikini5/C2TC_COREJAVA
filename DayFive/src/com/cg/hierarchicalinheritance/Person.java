package com.cg.hierarchicalinheritance;

public class Person {
	private int age;
	private String gender;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", gender=" + gender + "]";
	}
	
}

