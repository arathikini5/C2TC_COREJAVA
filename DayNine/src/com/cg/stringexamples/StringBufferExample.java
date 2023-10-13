package com.cg.stringexamples;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());//Default capacity=16
		
		StringBuffer sb=new StringBuffer(100);
		System.out.println(sb.capacity());
		
		
		/*StringBuffer sb=new StringBuffer("Hello");
		//System.out.println(sb.length());
		System.out.println(sb.capacity());//for string it will be same as length
		sb.append("How are you?");
		System.out.println(sb.capacity());
		sb.append("I am fine... Tell me something about yourself");//21*2+2=44
		System.out.println(sb.capacity());//62
		
		
		sb.ensureCapacity(60);
		System.out.println(sb.capacity());//62*2+2
		
//		sb.ensureCapacity(50); or 70
//		System.out.println(sb.capacity());//126*/
	}

}
