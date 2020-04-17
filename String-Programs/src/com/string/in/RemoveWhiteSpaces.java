package com.string.in;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static String removeSpaces(String st) {

		char[] ch = st.toCharArray();
		String nstr = "";

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != 32) {
				nstr = nstr + ch[i];
			}
		}
		return nstr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		System.out.println("String without Spaces:" + RemoveWhiteSpaces.removeSpaces(st));
		sc.close();
	}
}
