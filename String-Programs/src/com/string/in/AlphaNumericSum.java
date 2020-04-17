package com.string.in;

import java.util.Scanner;

public class AlphaNumericSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Alpha Numeric String: ");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		
		int sum = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				sum = sum + ch[i] - 48;
			}
		}
		System.out.println("Sum of Alpha Numeric is: " + sum);
		sc.close();
	}
}
