package com.string.in;

public class SwapString {
	
	public static void main(String[] args) {
		
		String x = "Google";
		String y = "Micorsoft";
		String temp = "";

		// Swapping
		temp = x;
		x = y;
		y = temp;

		System.out.println("The value of x:" + x);
		System.out.println("The value of y:" + y);
	}

}
