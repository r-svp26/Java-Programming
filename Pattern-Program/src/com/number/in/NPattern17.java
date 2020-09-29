package com.number.in;

import java.util.Scanner;
/*
 			1 
			2 3 
			3 4 5 
			4 5 6 7 
			5 6 7 8 9 
 */

public class NPattern17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		sc.close();
	}
}
