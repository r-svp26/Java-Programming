package com.string.in;

import java.util.Scanner;

// i love java ---> I LOVE JAVA

public class LowerToUpperString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 122 && ch[i] != ' ') {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		st = new String(ch);
		System.out.println("String is converted into UPPERCASE: " + st);
		sc.close();
	}
}
