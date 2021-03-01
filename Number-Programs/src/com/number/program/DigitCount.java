package com.number.program;

import java.util.Scanner;

public class DigitCount {

	public static int count(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int x = sc.nextInt();

		System.out.println(DigitCount.count(x));
		sc.close();
	}
}
