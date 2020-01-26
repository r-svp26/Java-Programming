package com.string.recursion;

import java.util.Scanner;

public class PalindromeString {

	private static boolean isPalindrome(String st, int i) {

		if (i == st.length() / 2) {
			return true;
		}
		if (st.charAt(i) != st.charAt(st.length() - 1 - i)) {
			return false;
		}
		return isPalindrome(st, i + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.next();
		boolean rs = isPalindrome(st, 0);
		if (rs = true) {
			System.out.println(st + " String is palindrome ");
		} else {
			System.out.println("String is not palindrome");
		}
		sc.close();
	}
}
