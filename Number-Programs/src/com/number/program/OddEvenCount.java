package com.number.program;

import java.util.Scanner;

public class OddEvenCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();

		int eCount = 0, oCount = 0, rem = 0;

		while (n != 0) {
			rem = n % 10;
			if (rem % 2 == 0)
				eCount++;
			else
				oCount++;

			n = n / 10;
		}

		System.out.println("Even digit:" + eCount);
		System.out.println("Odd digit:" + oCount);
		sc.close();
	}
}
