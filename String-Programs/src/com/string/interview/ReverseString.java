package com.string.interview;

import java.util.Scanner;

// WAJP to Reverse the Character of the String

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();

		char[] ch = st.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i] + "");
		}
		sc.close();
	}
}
