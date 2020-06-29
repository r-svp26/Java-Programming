package com.conversion.in;

import java.util.Scanner;

public class Decimal2Hexadecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Decimal Number:");
		int num = sc.nextInt();

		String hex = "";

		do {
			int rem = num % 16;
			if (rem < 10)
				hex = rem + hex;
			else if (rem >= 10 && rem <= 15) {
				hex = (char) (rem + 55) + hex;
			}
			num = num / 16;
		} while (num != 0);
		System.out.println("The Hexadecimal Number is:" + hex);
		sc.close();
	}
}
