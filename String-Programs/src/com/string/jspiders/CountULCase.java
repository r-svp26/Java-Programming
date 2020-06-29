package com.string.jspiders;

import java.util.Scanner;

public class CountULCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String:");
		String s1 = sc.nextLine();

		System.out.println("Enter the Second String:");
		String s2 = sc.nextLine();

		int uc = 0, lc = 0;
		int ucount=0, lcount=0;

		// Using charAt Method
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
				uc++;
			} else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
				lc++;
		}
		// Using toCharArray Method
		char[] ch = s2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ucount++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z')
				lcount++;
		}
		System.out.println("Using charAt Method");
		System.out.println("UPPERCASE LETTERS:" + uc);
		System.out.println("lowercase letter:" + lc);
		System.out.println("-----------------------");

		System.out.println("Using toCharArray Method");
		System.out.println("UPPERCASE LETTERS:" + ucount);
		System.out.println("lowercase letter:" + lcount);
		sc.close();
	}
}
