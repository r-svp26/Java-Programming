package com.number.in;

import java.util.Scanner;

/*
 				1 
				1 0 
				1 0 1 
				1 0 1 0 
				1 0 1 0 1
 */

public class NPattern9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j % 2 + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
