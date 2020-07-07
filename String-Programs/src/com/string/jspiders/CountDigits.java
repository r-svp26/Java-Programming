package com.string.jspiders;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.nextLine();

		int dcount = 0;
		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9')
				dcount++;
		}
		System.out.print("The Digits present in the String:" + dcount);
		sc.close();
	}
}
