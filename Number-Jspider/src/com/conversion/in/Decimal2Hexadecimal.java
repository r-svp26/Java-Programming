package com.conversion.in;

import java.util.Scanner;

public class Decimal2Hexadecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Decimal number:");
		int n = sc.nextInt();

		String hex = "";

		do {
			int rem = n % 16;
			if (rem < 10)
				hex = rem + hex;
			else if (rem >= 10 && rem <= 15) {
				hex = (char) (rem + 55) + hex;
			}
			n = n / 16;
		} while (n != 0);
		System.out.println("The Hexadecimal number is:" + hex);
		sc.close();
	}
}
