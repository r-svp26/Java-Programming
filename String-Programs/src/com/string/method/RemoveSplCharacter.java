package com.string.method;

public class RemoveSplCharacter {
	public static void main(String[] args) {

		String st = "@ Ram %&~{ 01234 (* SHYAM";
		String all = st.replaceAll("[^a-zA-Z0-9]", ""); // ^---> Used to replace
														// all except
		System.out.println(all);
	}
}
