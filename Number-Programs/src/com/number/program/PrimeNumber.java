package com.number.program;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int p = sc.nextInt();
		System.out.println(PrimeNumber.isPrime(p));
		sc.close();
	}
}
