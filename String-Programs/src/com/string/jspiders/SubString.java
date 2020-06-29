package com.string.jspiders;

import java.util.Scanner;

public class SubString {

	public static boolean isSubString(String s1, String s2) {

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			int j = 0;
			int k = i;

			while (k < ch1.length && j < ch2.length && ch1[k] == ch2[j]) {
				k++;
				j++;

			}
			if (j == ch2.length)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String:");
		String s1 = sc.nextLine();

		System.out.print("Enter the SubString:");
		String s2 = sc.next();

		boolean rs = isSubString(s1, s2);
		System.out.println(rs);
		sc.close();
	}
}