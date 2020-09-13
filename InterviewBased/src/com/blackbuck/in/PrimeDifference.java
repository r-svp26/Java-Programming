package com.blackbuck.in;

import java.util.Scanner;

public class PrimeDifference {

	public static boolean isPrime(int num) {

		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i <=num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int succeed_PreceedPrime(int n) {

		int x = 0, y = 0;

		for (int i = n + 1; i >= n; i++) {
			if (isPrime(i)) {
				x = i;
				break;
			}
		}
		for (int j = n - 1; j <= n; j--) {
			if (isPrime(j)) {
				y = j;
				break;
			}
		}
		return (x - y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		
			int result = succeed_PreceedPrime(num);
	
		System.out.println("The difference between Next and Prevoius Prime of a Number: " + result);
		sc.close();
	}
}











