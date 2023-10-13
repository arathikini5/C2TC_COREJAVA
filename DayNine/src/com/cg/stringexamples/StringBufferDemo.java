package com.cg.stringexamples;

public class StringBufferDemo {
	public static void main(String[] args) {
		//Immutable
		String s1=new String("Study");
		//s1.concat("Night");
		//System.out.println(s1);//StudyNight -output: Study
		
		String s2=s1.concat("Night");
		System.out.println(s2);//output- StudyNight
		
		//mutable
		StringBuffer sb=new StringBuffer("Study");
		sb.append("Night");
		System.out.println(sb);//StudyNight
	}
}
