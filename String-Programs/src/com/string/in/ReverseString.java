package com.string.in;

public class ReverseString {

	public static void main(String[] args) {

		String str="I love Java";
		char[] st=str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(st[i]);
		}
	}
}
