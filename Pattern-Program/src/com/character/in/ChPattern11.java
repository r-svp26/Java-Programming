package com.character.in;

import java.util.Scanner;

/*
 			        A 
			      B B B 
			    C C C C C 
			  D D D D D D D 
			E E E E E E E E E 
 */

public class ChPattern11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print((char) (i + 64) + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
