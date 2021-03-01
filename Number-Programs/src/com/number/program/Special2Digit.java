package com.number.program;

import java.util.Scanner;

// 19 29

public class Special2Digit {

	public static boolean isSpl2Digit(int n) {

		int a = n % 10;
		int b = n / 10;
		int temp = ((a + b) + (a * b));

		if (temp == n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();

		boolean rs = isSpl2Digit(n);
		System.out.println(rs);
		sc.close();
	}
}
