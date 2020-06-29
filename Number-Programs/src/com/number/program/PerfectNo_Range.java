package com.number.program;

import java.util.Scanner;

public class PerfectNo_Range {

	static boolean isPerfect(int n) {

		int sum = 0;
		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0)
				sum = sum + i;
			i++;
		}
		if (sum == n)
			return true;

		else
			return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Range Number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			boolean rs = isPerfect(i);
			if (rs) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
