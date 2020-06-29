package com.number.program;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();

		boolean rs = isPrime(num);
		System.out.println(rs);
		sc.close();
	}
}
