package com.string.jspiders;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();

		int sum = 0;
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				sum = sum + ch[i] - 48;
			}
		}
		System.out.println("The Sum of Digits:" + sum);
		sc.close();
	}
}