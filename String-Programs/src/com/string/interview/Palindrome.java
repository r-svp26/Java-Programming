package com.string.interview;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String s) {

		String st = s.toLowerCase();

		int f = 0, size = st.length() - 1;

		char[] ch = st.toCharArray();
		for (int i = 0; i < size; i++) {
			if (ch[f] != ch[size])
				return false;
			f++;
			size--;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.next();

		boolean rs = isPalindrome(st);
		if (rs == true)
			System.out.println("String is Palindrome!");
		else
			System.out.println("String is not a Palindrome!");
		sc.close();
	}
}
