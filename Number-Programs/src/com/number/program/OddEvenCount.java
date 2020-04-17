package com.number.program;

import java.util.Scanner;

public class OddEvenCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();

		int evenCount = 0;
		int oddCount = 0;
		int rem = 0;

		while (num != 0) {
			rem = num % 10;
			if (rem % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num = num / 10;
		}
		System.out.println("Even digits :" + evenCount);
		System.out.println("Odd digits :" + oddCount);
		sc.close();
	}
}
