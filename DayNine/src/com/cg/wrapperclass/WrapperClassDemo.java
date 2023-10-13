package com.cg.wrapperclass;

public class WrapperClassDemo {
	
	//1.Autoboxing 
	//2.Unboxing
	
	//Autoboxing
     int i=10;//Primitive type creation
     //Integer j=new Integer();
     Integer k=i;//Wrapper type
     
     //Unboxing
     Integer x=20;//Wrapper Type
     int y=x;//Primitive-Newer version
     int z=x.intValue();//older version
     
     
     //Typecasting 
     float a=12.23f;
     Integer b=(int)a;
     
     float c=12.23f;
     int d=(int)c;
     

}
