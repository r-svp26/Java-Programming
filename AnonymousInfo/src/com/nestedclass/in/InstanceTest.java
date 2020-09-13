package com.nestedclass.in;

public class InstanceTest {

	public static void main(String[] args) {
		
		InstanceNested ns=new InstanceNested();
		System.out.println(ns.x+" "+ ns.x1);
		
		System.out.println(InstanceNested.y);
		ns.Display();
		
		System.out.println("--------------------------------------");
		
		// First Create Object for Outer Class then Create Object for Instance Class
		InstanceNested.Demo demo= new InstanceNested().new Demo(); 
		
		System.out.println(demo.x);  // 100
		System.out.println(demo.y); // 120
		demo.m1();
		
		
	}
}
