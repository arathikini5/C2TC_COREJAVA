package com.cg.hierarchicalinheritance;

public class Student  extends Person{
		private int rollno;
		private String studentName;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", studentName=" + studentName + ", getAge()=" + getAge()
					+ ", getGender()=" + getGender() + "]";
		}

}
