package com.string.jspiders;

import java.util.Scanner;

public class CountV_C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		
		String st = sc.nextLine();
		String str = st.toUpperCase();

		char[] ch = str.toCharArray();
		int vc = 0, cc = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				vc++;
			} else {
				if (ch[i] != ' ')
					cc++;
			}
		}
		System.out.println("Number of Vowel:" + vc);
		System.out.println("Number of Consonent:" + cc);
		sc.close();
	}
}
