package com.conversion.in;

import java.util.Scanner;

public class Binary2Hexadecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Binary Number: ");
		int n = sc.nextInt();

		int hex = 0, pow = 1;
		do {
			int rem = n % 16;
			if (rem < 10)
				hex = hex + rem * pow;
			else if (rem > 10 && rem <= 15) {
				hex = (char) hex + (rem + 55) * pow;
			}
			pow = pow * 2;
			n = n / 16;
		} while (n != 0);
		System.out.println("The Hexadecimal Value is:" + hex);
		sc.close();

	}

}
