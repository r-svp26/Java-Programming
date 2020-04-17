package com.string.in;

import java.util.Scanner;

// PROGRAMMING --> programming 

public class UpperToLowerLetter {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		st = new String(ch);
		System.out.println("String is in Uppercase: " + st);
		sc.close();
	}
}
