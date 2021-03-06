package com.number.in;

import java.util.Scanner;
/*
 				1     
		      2 1 2 
		    3 2 3 2 3 
		  4 3 4 3 4 3 4 
		5 4 5 4 5 4 5 4 5 
 */

public class NPattern14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int p = i;
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(p + " ");
				if (p < i)
					p++;
				else
					p--;
			}
			System.out.println();
		}
		sc.close();
	}
}
