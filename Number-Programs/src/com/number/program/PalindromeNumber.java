package com.number.program;

import java.util.Scanner;

public class PalindromeNumber {

	public static boolean isPalindrome(int n) {

		int rev = 0, temp = n;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (rev == temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();

		boolean rs = isPalindrome(num);
		System.out.println(rs);
		sc.close();
	}
}
