package com.string.jspiders;

import java.util.Scanner;

public class ReadCharacter {

	public static void readChar(String st) {

		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String st = sc.nextLine();

		System.out.println("Enter the Second String");
		String str = sc.nextLine();

		System.out.println("STRING CHARACTER USING charAt");
		for (int i = 0; i < st.length(); i++) {
			System.out.println(st.charAt(i));
		}
		System.out.println("---------------------------------");

		System.out.println("STRING CHARACTER USING toCharArray");
		readChar(str);
		sc.close();
	}
}
