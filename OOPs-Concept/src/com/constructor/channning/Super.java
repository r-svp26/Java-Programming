package com.constructor.channning;

public class Super {
	
	int x;
	
	public Super(){  // <---------- 5
		System.out.println("No args Super Contructor");
	}
	
	public Super(int x){  // <-------- 4
		this();
		this.x=x;
		System.out.println("One args Super Constructor");
	}
}
