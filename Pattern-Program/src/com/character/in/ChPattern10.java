package com.character.in;

import java.util.Scanner;

/*
			A B C D E 
			  B C D E 
			    C D E 
			      D E 
			        E
 */

public class ChPattern10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= num; k++) {
				System.out.print((char) (k + 64) + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
