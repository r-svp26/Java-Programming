package com.number.recursion;

import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int n) {

		int i = 2;
		if (n % i == 0 || n == 1) {
			return false;
		}
		if (i > n / 2) {
			return true;
		}
		return isPrime(i + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();

		System.out.println(PrimeNumber.isPrime(num));
		sc.close();
	}
}
