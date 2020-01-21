package com.string.in;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String st) {
		int start = 0;
		int end = st.length() - 1;

		while (start < end) {
			if(st.charAt(start)!=st.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		boolean rs=isPalindrome(str);
		System.out.println(rs);
		sc.close();
	}
}
