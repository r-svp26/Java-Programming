package com.string.in;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.next();
		
		String rev = "";

		for (int i = st.length() - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);
		}
		if (st.equalsIgnoreCase(rev)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not a Palindrome");
		}
		sc.close();
	}
}
