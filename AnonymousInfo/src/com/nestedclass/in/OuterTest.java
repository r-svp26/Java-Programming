package com.nestedclass.in;

public class OuterTest {

	public static void main(String[] args) {
		
		System.out.println("-----------Outer---------Class-----------------------");
		System.out.println("Outer Class static Variable: "+OuterClass.y);  // 200
		OuterClass out=new OuterClass();
		System.out.println("Outer Class Instance Variable: "+out.x); // 100
		
		System.out.println("-----------Nested---------Class-----------------------");
		System.out.println("Nested Class static Variable: "+OuterClass.NestedClass.y);  // 45
		
		OuterClass.NestedClass nc=new OuterClass.NestedClass();
		System.out.println("Nested Class Instance Variable: "+nc.x); // 10
		nc.m1();
		
	}
}
