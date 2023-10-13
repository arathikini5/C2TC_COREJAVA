package com.cg.statickeyword;

public class student {
    private int id;
    private String name;
   //private String college;
    private static String college="MIET";
//public student(int id, String name, String college) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.college = college;
//}
    
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", college=" + college + "]";
}
public student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
    
void modify()
{
	college="Meerut Institute of Technology and Management";
}
}
