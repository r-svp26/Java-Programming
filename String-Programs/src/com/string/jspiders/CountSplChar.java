package com.string.jspiders;

import java.util.Scanner;

public class CountSplChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();

		int splCount = 0;
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] >= 'A' && ch[i] < 'Z') || (ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= '0' && ch[i] <= '9')) {

			} else
				splCount++;
		}
		System.out.println("The Special Character Present in the String:" + splCount);
		sc.close();
	}
}
