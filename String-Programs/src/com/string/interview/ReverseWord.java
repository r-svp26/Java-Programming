package com.string.interview;

import java.util.Scanner;

// WAJP to Reverse the Words of the Sentence

/*   Java Is good ------> avaJ sI doog  */

public class ReverseWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();
		
		char[] ch = st.toCharArray();

		String rst = "";

		for (int i = 0; i < ch.length; i++) {
			int j = i;
			while (i < ch.length && ch[i] != ' ')
				i++;

			int k = i - 1;
			while (k >= j) {
				rst = rst + ch[k];
				k--;
			}

			if (i < ch.length)
				rst = rst + " ";
		}
		System.out.println(rst);
		sc.close();
	}
}
