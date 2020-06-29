package com.string.in;

import java.util.Scanner;

public class WordCount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.nextLine();

		int count = 1;
		for (int i = 0; i < st.length() - 1; i++) {
			if ((st.charAt(i) == ' ') && (st.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("The number of Words in String: "+count);
		sc.close();
	}
}
