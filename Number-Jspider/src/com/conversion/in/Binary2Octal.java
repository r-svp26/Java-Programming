package com.conversion.in;

import java.util.Scanner;

public class Binary2Octal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Binary Number:");
		int num = sc.nextInt();

		int oct = 0;
		int pow = 1;

		do {
			int rem = num % 8;
			oct = oct + rem * pow;
			pow = pow * 2;
			num = num / 8;
		} while (num != 0);
		System.out.println("Octal Number is:" + oct);
		sc.close();
	}
}
