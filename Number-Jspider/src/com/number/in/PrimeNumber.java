package com.number.in;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int num) {

		int i = 2;
		while (i <= num / 2) {
			if (num == 0 || num == 1 || num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();

		boolean rs = isPrime(num);
		System.out.println(rs);
		sc.close();
	}
}
