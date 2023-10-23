package com.cg.singleinheritance;

public class Student extends Citizen {
	private int rollno;
	private String collegeName;
	public int getRollno() {
		return rollno;
	}
	
	public Student() {
		super();
	}

	
	public Student(int rollno, String collegeName) {
		super();
		this.rollno = rollno;
		this.collegeName = collegeName;
	}

	public Student(String name, String adhaarno, String address, long phno,int rollno, String collegeName) {
		super(name, adhaarno, address, phno);
		this.rollno = rollno;
		this.collegeName = collegeName;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdhaarno()=" + getAdhaarno() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}

