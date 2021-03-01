package com.string.interview;

// WAJP to Convert First Character to last Character of each Word in String

/* Java Is Good ------> aavJ  sI dooG  */

import java.util.Scanner;

public class Replace1st2lstChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();

		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				int f = i;

				while (i < ch.length && ch[i] != ' ') {
					i++;
				}
				char temp = ch[i - 1];
				ch[i - 1] = ch[f];
				ch[f] = temp;
			}
		}
		String s = new String(ch);
		System.out.println(s);
		sc.close();
	}
}
