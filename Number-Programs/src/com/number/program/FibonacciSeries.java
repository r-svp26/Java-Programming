package com.number.program;

import java.util.Scanner;

// 0 1 1 2 3 5 8 13 21 34 

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();

		int n1 = 0, n2 = 1, fib;
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < num; i++) {
			fib = n1 + n2;
			System.out.print(" " + fib);
			n1 = n2;
			n2 = fib;
		}
		sc.close();
	}
}
