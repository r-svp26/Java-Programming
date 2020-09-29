package com.star.in;

import java.util.Scanner;

/*
 					      * 
					    * * * 
					  * * * * * 
					* * * * * * * 
					  * * * * * 
					    * * * 
					      * 
 
 */

public class SPattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		int sp = n / 2, st = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("* ");
			}
			if (i <= n / 2) {
				sp--;
				st = st + 2;
			} else {
				sp++;
				st = st - 2;
			}
			System.out.println();
		}
		sc.close();
	}
}
