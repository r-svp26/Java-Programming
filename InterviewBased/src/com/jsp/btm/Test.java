package com.jsp.btm;

public class Test {
	
	String name="Ritesh Kumar";

	@Override
	public String toString() {
		return name;
	}
	
	String test=name;

	public static void main(String[] args) {
		Test test=new Test();
		System.out.println(test);
	}
}
