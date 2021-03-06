package com.string.interview;

import java.util.Scanner;

public class CountSubString {

	public static int countSubString(String st, String substr) {

		char[] ch1 = st.toCharArray();
		char[] ch2 = substr.toCharArray();
		int count = 0;

		for (int i = 0; i < ch1.length; i++) {
			int j = 0;
			int k = i;
			while (k < ch1.length && j < ch2.length && ch2[j] == ch1[k]) {
				j++;
				k++;
			}
			if (j == ch2.length) {
				i = k - 1;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String:");
		String st = sc.nextLine();

		System.out.print("Enter the String:");
		String substr = sc.next();

		int count = countSubString(st, substr);
		System.out.println("The Number of SubString Present in the String:" + count);
		sc.close();
	}
}
