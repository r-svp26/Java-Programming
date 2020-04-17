package com.string.method;

public class RemoveWhiteSpace {
	public static void main(String[] args) {

		String st = "Java  programming is in   demand";
		System.out.println("Before removing white spaces:" + st);
		String sp = st.replaceAll("\\s", "");
		System.out.println("After removing white spaces:" + sp);
	}
}
