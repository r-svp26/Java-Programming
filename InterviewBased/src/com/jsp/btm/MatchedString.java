package com.jsp.btm;
import java.util.Scanner;

public class MatchedString {

	public static boolean isMatch(String s1, String s2) {

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		for (int i = 0; i < ch1.length;) {
			if (ch2.length != ch1.length) {
				return false;
			}
			else if (ch2[i] <= ch1.length) {
				i++;
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First String:");
		String s1 = sc.nextLine();

		System.out.print("Enter the Second String:");
		String s2 = sc.nextLine();

		boolean rs = isMatch(s1, s2);
		System.out.println(rs);
		System.out.println("love");
		sc.close();
	}
}
