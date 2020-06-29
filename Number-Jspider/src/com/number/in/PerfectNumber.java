package com.number.in;

import java.util.Scanner;

public class PerfectNumber {

	public static boolean isPerfect(int num) {

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
			if (sum == num)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();

		boolean rs = isPerfect(num);
		System.out.println(rs);
		sc.close();

	}

}
