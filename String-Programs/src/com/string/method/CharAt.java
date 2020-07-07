package com.string.method;

import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();

		char index = st.charAt(0);
		char[] ch = st.toCharArray();
		System.out.println("Character at index:" + index);

		System.out.println(ch[5]);

		sc.close();
	}

}
