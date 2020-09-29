package com.number.in;

import java.util.Scanner;
/*
 			        1 
			      2 3 4 
			    5 6 7 8 9 
			  1 2 3 4 5 6 7 
			8 9 1 2 3 4 5 6 7
 */

public class NPattern16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		int p = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (p >= 10) {
					p = 1;
					System.out.print(p + " ");
					p++;
				} else {
					System.out.print(p + " ");
					p++;
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
