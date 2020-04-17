package com.string.in;

import java.util.Scanner;

// java is good technology ---> Java Is Good Technology

public class InitCapEachWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String in lower Case: ");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();

		// To convert first Character of First letter into Capital(java --->Java)
		ch[0] = (char) (ch[0] - 32);

		for (int i = 1; i < ch.length - 1; i++) {
			if (ch[i] == 32) {
				ch[i + 1] = (char) (ch[i + 1] - 32);
			}
		}
		st = new String(ch);
		System.out.println("" + st);
		sc.close();
	}
}
