package com.string.interview;

import java.util.Scanner;

public class SubString {

	public static boolean isSubString(String st, String substr) {

		char[] ch1 = st.toCharArray();
		char[] ch2 = substr.toCharArray();

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
		String st = sc.nextLine();

		System.out.print("Enter the SubString:");
		String substr = sc.next();

		boolean rs = isSubString(st, substr);
		System.out.println(rs);
		sc.close();
	}
}
