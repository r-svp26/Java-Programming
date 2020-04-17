package com.string.in;

public class ReverseEachWord {
	public static void main(String[] args) {

		String st = "Welcome To Java and HackerRank";
		String[] word = st.split(" ");
		String revString = "";

		for (String str : word) // Welcome
		{
			String revWord = "";
			for (int i = str.length() - 1; i >= 0; i--) // Welcome <---1stLoop
			{
				revWord = revWord + str.charAt(i);
			}
			revString = revString + revWord + " "; // emocleW + oT + avaJ
		}
		System.out.println(revString);
	}
}
