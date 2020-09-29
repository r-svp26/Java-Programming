package com.number.in;

import java.util.Scanner;

public class PalindromeNumber {

	public static boolean isPalindrome(int num) {
		
		int rev = 0, temp = num;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
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
