package com.number.program;

public class SwapNumber {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// Using third variable
		int temp = a;
		a = b;
		b = temp;

		// Using Operators: Without third variable

		/*
		 * a = a + b; b = a - b; a = a - b;
		 */

		// Using bitwise-XOR

		/*
		 * a=a^b; b=a^b; a=a^b;
		 */

		// Using Single-statement

		/*
		 * b=a+b-(a=b);
		 */

		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
	}
}
