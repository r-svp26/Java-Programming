package com.number.program;

import java.util.Scanner;

//0 1 1 2 3 5 8 13 21 34 55 89

public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int a = 0, b = 1, c;
		System.out.print(a + " " + b);

		for (int i = 0; i < num; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		sc.close();
	}
}
