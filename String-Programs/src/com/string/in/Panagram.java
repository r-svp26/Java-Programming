package com.string.in;

import java.util.Scanner;

public class Panagram {

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

	public static int check(String st) {
		
		for (char i = 'A'; i <= 'Z'; i++) {
			if ((st.indexOf(i) < 0) && (st.indexOf((char) (i + 32)) > 0)) {
				return -1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.nextLine();
		st = removeSpaces(st);

		int num = check(st);

		if (num == -1) {
			System.out.println("String is not a Panagram");
		} else {
			System.out.println("String is a Panagram");
		}
		sc.close();
	}
}
