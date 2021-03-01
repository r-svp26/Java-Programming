package com.string.method;

public class RemoveSplCharacter {
	public static void main(String[] args) {

		String st = "@ Ram %&~{ 01234 (* SHYAM";

		/* Used to replace all except */
		String spl = st.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(spl);
	}
}
