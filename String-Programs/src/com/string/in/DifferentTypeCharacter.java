package com.string.in;

import java.util.Scanner;

public class DifferentTypeCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int uc = 0, lc = 0, spc = 0, dc = 0, space = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				uc++;
			} else if (ch[i] >= 97 && ch[i] <= 122) {
				lc++;
			} else if (ch[i] >= 48 && ch[i] <= 57) {
				dc++;
			} else if (ch[i] == 32) {
				space++;
			} else {
				spc++;
			}
		}
		System.out.println("No. of UpperCase:" + uc);
		System.out.println("No. of LowerCase:" + lc);
		System.out.println("No. of DigitCount:" + dc);
		System.out.println("No. of Spaces:" + space);
		System.out.println("No. of Special Character:" + spc);
		sc.close();
	}
}
