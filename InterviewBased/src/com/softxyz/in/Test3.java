package com.softxyz.in;

public class Test3 {
	
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		
		Test3 t1=new Test3();
		t1.a=100;
		t1.b=200;
		
		Test3 t2=new Test3();
		System.out.println("t1.a="+t1.a+" t1.b="+t1.b);
		System.out.println("t2.a="+t2.a+" t2.b="+t2.b);

	}
}
