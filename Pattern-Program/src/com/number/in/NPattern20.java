package com.number.in;

import java.util.Scanner;
/*
 		1 
		0 1 
		0 1 0 
		1 0 1 0 
		1 0 1 0 1 
 */

public class NPattern20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k % 2 + " ");
				k++;
			}
			System.out.println();
		}
		sc.close();
	}
}
