package com.conversion.in;

import java.util.Scanner;

public class Decimal2Octal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Decimal Number:");
		int num = sc.nextInt();

		String oct = "";

		do {
			int rem = num % 8;
			oct = rem + oct;
			num = num / 8;
		} while (num != 0);
		System.out.println("Octal Number is:" + oct);
		sc.close();
	}
}
