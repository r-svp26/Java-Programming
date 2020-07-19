package com.string.interview;

import java.util.Scanner;

public class AnagramString {

	public static boolean isAnagram(String s1, String s2) {

		int[] a = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				a[ch - 65]++;
			else if (ch > 'a' && ch <= 'z')
				a[ch - 97]++;
		}

		int[] b = new int[26];
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				b[ch - 65]++;
			else if (ch > 'a' && ch <= 'z')
				b[ch - 97]++;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First String:");
		String s1 = sc.nextLine();

		System.out.print("Enter the Second String:");
		String s2 = sc.nextLine();

		boolean rs = isAnagram(s1, s2);
		System.out.println(rs);
		sc.close();
	}
}
