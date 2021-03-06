package com.string.interview;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.nextLine();
		int vc = 0, cc = 0, uc = 0, lc = 0, spc = 0, dc = 0;

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				uc++;
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
					vc++;
				else
					cc++;
			} else if (ch >= 'a' && ch <= 'z') {
				lc++;
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vc++;
				else
					cc++;
			} else if (ch >= '0' && ch <= '9') {
				dc++;
			} else {
				spc++;
			}
		}
		
		System.out.println("Number of Vowel Count: " + vc);
		System.out.println("Number of Consonent Count: " + cc);
		System.out.println("Number of UpperCase Count: " + uc);
		System.out.println("Number of LowerCase Count: " + lc);
		System.out.println("Number of Digit Count: " + dc);
		System.out.println("Number of Space Count: " + spc);
		sc.close();
	}
}
