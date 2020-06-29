package com.conversion.in;

import java.util.Scanner;

public class Binary2Decimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number");
		int num = sc.nextInt();

		int dec = 0;
		int pow = 1;

		do {
			int rem = num % 10;
			dec = dec + rem * pow;
			pow = pow * 2;
			num = num / 10;
		} while (num != 0);
		System.out.println("The Decimal Number is:" + dec);
		sc.close();
	}
}
