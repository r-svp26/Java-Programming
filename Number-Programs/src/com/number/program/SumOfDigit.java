package com.number.program;

import java.util.Scanner;

public class SumOfDigit {

	public static int digitSum(int num) {
		int sum = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int x = sc.nextInt();
		System.out.println(SumOfDigit.digitSum(x));
		sc.close();
	}
}
