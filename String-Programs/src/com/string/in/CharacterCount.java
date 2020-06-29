package com.string.in;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		
		String st = sc.nextLine();
		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122
					|| ch[i] >= 48 && ch[i] <= 57 && ch[i] != 32 && ch[i] != ',' && ch[i] != '.') {
				count++;
			}
		}
		System.out.println("No. of Characters:" + count);
		sc.close();
	}
}
