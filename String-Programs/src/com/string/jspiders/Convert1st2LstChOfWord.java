package com.string.jspiders;

// WAJP to Convert First Character to last Character of each Word of a String

/* Java Is Good ------> aavJ  sI dooG  */

import java.util.Scanner;

public class Convert1st2LstChOfWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();

		char[] ch = st.toCharArray();
		int k = 0;

		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				k = i;

				while (i < ch.length && ch[i] != ' ') {
					i++;
				}
				char t = ch[i - 1];
				ch[i - 1] = ch[k];
				ch[k] = t;
			}
		}
		String s = new String(ch);
		System.out.println(s);
		sc.close();
	}
}