package com.number.in;

import java.util.Scanner;

/*
 			      1 
			    2 1 2 
			  3 2 1 2 3 
			4 3 2 1 2 3 4 
			  3 2 1 2 3 
			    2 1 2 
			      1 
 */

public class NPattern24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		int sp = n / 2, ele = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}

			int p = ele / 2 + 1;
			for (int k = 1; k <= ele; k++) {
				System.out.print(p + " ");
				if (k <= ele / 2)
					p--;
				else
					p++;
			}
			if (i <= n / 2) {
				sp--;
				ele = ele + 2;
			} else {
				sp++;
				ele = ele - 2;
			}
			System.out.println();
		}
		sc.close();
	}
}
