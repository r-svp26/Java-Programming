package com.constructor.channning;

public class Child extends Super {

	public Child() { // <------ 2
		this(10);
		System.out.println("No args Child Constructor");
	}

	public Child(int x) { // <------- 3
		super(x);
		System.out.println("One args Child Constructor");
	}

	public static void main(String[] args) {
		Child child = new Child(); // <------- 1

		System.out.println(child.x);
	}
}

/*
 * 
 * No args Super Contructor 
 * One args Super Constructor 
 * One args Child
 * Constructor No args Child Constructor
 * 10
 * 
 */