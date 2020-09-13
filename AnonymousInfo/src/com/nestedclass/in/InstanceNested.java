package com.nestedclass.in;

public class InstanceNested {
	
	int x=10;
	static int y=20;
	
	int x1=30;
	int y1=40;
	
	
	class Demo{
		
		 int x=100;
		 int y=120;
		 
		 int x1=130;
		 
		 void m1(){
			 System.out.println("I'm m1()");
			 
			 System.out.println(x); // 100
			 
			 InstanceNested ic=new InstanceNested();
			 System.out.println(ic.x); // 10
			 
			 System.out.println(InstanceNested.y); // 20
			 
			 System.out.println(y); // 120
			 
			 System.out.println(ic.x1); // 30
			 System.out.println(x1);  // 130
			 
		 }
	}
	
	/* To access Nested Class method Info from Outer class method */
	void Display(){
		Demo demo=new Demo();
		System.out.println(demo.x);
		demo.m1();
	}
}
