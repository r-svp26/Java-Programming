package com.string.interview;

import java.util.Scanner;

public class LastIndexOf {

	public static int lastIndexOf(String st, String substr) {
		char[] ch1 = st.toCharArray();
		char[] ch2 = substr.toCharArray();

		int in = -1;
		for (int i = 0; i < ch1.length; i++) {
			int j = 0;
			int k = i;
			while (k < ch1.length && j < ch2.length && ch1[k] == ch2[j]) {
				j++;
				k++;
			}
			if (j == ch2.length) {
				in = i;
				i = k - 1;
			}
		}
		return in;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String:");
		String st = sc.nextLine();

		System.out.print("Enter the SubString:");
		String substr = sc.next();

		int lstIndex = lastIndexOf(st, substr);
		System.out.println("The LastIndexOf of the SubString is: " + lstIndex);

		sc.close();
	}
}
