package com.jsp.btm;

public class PalindromeCounter {

	public static boolean isPalindrome(String st) {

		String rev = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			
			rev = rev + st.charAt(i);
		         
			
		}
		if (st.equalsIgnoreCase(rev))
			return true;
		else
			return false;
	}

	public static void palindromeCounter(String s) {

		int count = 0;

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	}

	public static void main(String[] args) {

		String st = "tacocat";
		
		
	}
}
