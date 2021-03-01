package com.string.interview;

import java.util.Scanner;

/* WAJP to Reverse word of the String
 * 
 * rama and laxmana ----> laxmana and rama
 * 
 */

public class ReverseSentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.nextLine();

		char[] ch = st.toCharArray();
		String rst = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			int lst =i;
			while (i >= 0 && ch[i] != ' ') 
				i--;

			int k = i + 1;
			while (k <= lst) {
				rst = rst + ch[k];
				k++;
			}
			if (i >= 0)
				rst = rst + " ";
		}
		System.out.println(rst);
		sc.close();
	}
}
