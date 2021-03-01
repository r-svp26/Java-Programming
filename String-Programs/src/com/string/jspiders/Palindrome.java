package com.string.jspiders;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String st) {

		String s = st.toLowerCase();
		char[] ch = s.toCharArray();
		String rst = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			rst = rst + ch[i];
		}
		if (st == rst) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.next();

		boolean rs = isPalindrome(st);
		System.out.println(rs);
		
		 sc.close();
	}

}
