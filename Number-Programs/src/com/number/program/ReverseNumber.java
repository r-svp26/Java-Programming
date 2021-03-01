 package com.number.program;

import java.util.Scanner;

public class ReverseNumber {

	public static int revNum(int num) {

		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int x = sc.nextInt();

		System.out.println("Reverse Number is:" + revNum(x));
		sc.close();
	}
}
