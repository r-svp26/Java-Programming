package com.string.jspiders;

import java.util.Scanner;

//WAJP to display First & Last Character of the String

public class FirstLastChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();

		char first = st.charAt(0);
		char last = st.charAt(st.length() - 1);

		System.out.println("The First Character:" + first);
		System.out.println("The Last Character:" + last);
		sc.close();
	}
}
