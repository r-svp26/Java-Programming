package com.number.in;

import java.util.Scanner;

/*	0 0 0 0 0 
	1 1 1 1 1 
	0 0 0 0 0 
	1 1 1 1 1 
	0 0 0 0 0  */

public class NPattern5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(i % 2 + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
