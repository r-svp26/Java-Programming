package com.star.in;

import java.util.Scanner;

/*
		* * * * * * * * *
		  * * * * * * *
		    * * * * * 
		      * * *
		        *           */

public class SPattern5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * (n - i) + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}

/*
 * int sp=0; int ele=2*num-1;
 * 
 * for (int i = 1; i <= num; i++) { for (int j = 1; j<=sp; j++) {
 * System.out.print("  "); } for (int k = 1; k <=ele; k++) {
 * System.out.print("* "); } if(i<=num){ sp++; ele=ele-2; }
 * System.out.println(); }
 */