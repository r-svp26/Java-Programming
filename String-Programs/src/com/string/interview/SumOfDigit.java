package com.string.interview;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();

		int dcount = 0, sum = 0;
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				dcount++;
				sum = sum + ch[i] - 48;
			}
		}
		System.out.println("The Number of Digit present is " + dcount + " and their Sum is: " + sum);
		sc.close();
	}
}
