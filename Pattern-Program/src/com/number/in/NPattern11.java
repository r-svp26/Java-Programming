package com.number.in;

import java.util.Scanner;

/*
 			1 2 3 4 5 
			  2 3 4 5 
			    3 4 5 
			      4 5 
			        5 
 */

public class NPattern11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
