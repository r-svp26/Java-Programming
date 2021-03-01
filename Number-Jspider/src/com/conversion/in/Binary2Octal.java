package com.conversion.in;

import java.util.Scanner;

public class Binary2Octal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Binary Number:");
		int n = sc.nextInt();

		int oct = 0, pow = 1;
		
		do {
			int rem = n % 8;
			oct = oct + rem * pow;
			pow = pow * 2;
			n = n / 8;
		} while (n != 0);
		System.out.println("Octal Number is :" + oct);
		sc.close();
	}
}
