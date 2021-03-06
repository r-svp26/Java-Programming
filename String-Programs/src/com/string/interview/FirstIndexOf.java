package com.string.interview;

import java.util.Scanner;

public class FirstIndexOf {

	public static int firstIndexOf(String st, String substr) {

		char[] ch1 = st.toCharArray();
		char[] ch2 = st.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			int j = 0;
			int k = i;
			while (k < ch1.length && j < ch2.length && ch2[k] == ch1[j]) {
				j++;
				k++;
			}
			if (j == ch2.length) 
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String:");
		String st = sc.nextLine();

		System.out.print("Enter the SubString:");
		String substr = sc.next();

		int firstIndex = firstIndexOf(st, substr);
		System.out.println("The Substring FirstIndexOf:" + firstIndex);
		sc.close();

	}
}
