package com.conversion.in;

import java.util.Scanner;

public class Binary2Decimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Binary Number: ");
		int n = sc.nextInt();

		int dec = 0, pow = 1;
		
		do {
			int rem = n % 10;
			dec = dec + rem * pow;
			pow = pow * 2;
			n = n / 10;
		} while (n != 0);
		System.out.println("The Decimal Number is:" + dec);
		sc.close();
	}
}
