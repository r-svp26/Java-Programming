package com.string.in;

import java.util.Scanner;

public class Anagram {

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

	public static String toLowerCase(String st) {

		char[] ch = st.toCharArray();
		String nstr = "";

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				nstr = nstr + (char) (ch[i] + 32);
			} else {
				nstr = nstr + ch[i];
			}
		}
		return nstr;
	}

	public static String sort(String st) {

		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		String nstr = new String(ch);
		return nstr;
	}

	public static boolean compare(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {

			String st1 = s1.toLowerCase();
			String st2 = s2.toLowerCase();
			st1 = sort(st1);
			st2 = sort(st2);

			char[] ch1 = st1.toCharArray();
			char[] ch2 = st2.toCharArray();

			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the First String: ");
		String s1 = sc.nextLine();
		System.out.print("Enter the Second String: ");
		String s2 = sc.nextLine();

		s1 = removeSpaces(s1);
		s2 = removeSpaces(s2);
		boolean b = compare(s1, s2);

		if (b) {
			System.out.println("String is Anagram");
		}
		 else {
			System.out.println("String is not a Anagram");
		 }
		sc.close();
	}
}
