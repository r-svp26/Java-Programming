package com.string.in;

import java.util.Scanner;

// java is good technology ---> Java is good technology


public class ConvertFirstCharacterOnly {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String in lower case: ");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();

		/* To convert first character only of string */
		ch[0] = (char) (ch[0] - 32);

		st = new String(ch);
		System.out.println("String first character is converted into Capital:" + st);
		sc.close();
	}
}
