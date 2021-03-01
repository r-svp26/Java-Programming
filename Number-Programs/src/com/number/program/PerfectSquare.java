package com.number.program;

import java.util.Scanner;

public class PerfectSquare {

	public static boolean isPerfect(int n) {

		int temp;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				temp = i * i;
				if (temp == n)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");

		int n = sc.nextInt();
		System.out.println(PerfectSquare.isPerfect(n));
		sc.close();
	}
}
