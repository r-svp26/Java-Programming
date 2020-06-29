package com.string.jspiders;

import java.util.Scanner;

//WAJP to Convert lowercase to UPPERCASE

public class ConvertL2UCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: "); // Java
		String st = sc.nextLine();

		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z')
				ch[i] = (char) (ch[i] - 32); // {'J','A','V','A'}
		}
		String s = new String(ch);// "JAVA"
		System.out.println("String is Converted: " + s); // JAVA
		sc.close();
	}
}
