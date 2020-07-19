package com.string.interview;

import java.util.Scanner;

public class PanagramString {

	public static boolean isPanagram(String st) {
		if (st.length() < 26) {
			return false;
		}
		int[] count = new int[26];

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				count[ch - 65]++;
			else if (ch >= 'a' && ch <= 'z')
				count[ch - 97]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.nextLine();

		boolean rs = isPanagram(st);
		System.out.println(rs);
		sc.close();
	}
}
