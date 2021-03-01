package com.string.interview;

import java.util.Scanner;

// WAJP to Convert UPPERCASE to lowercase

public class ConvertU2LCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");

		String st = sc.nextLine();
		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		String s = new String(ch);
		System.out.println(s);
		sc.close();
	}
}
