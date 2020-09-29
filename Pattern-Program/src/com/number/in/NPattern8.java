package com.number.in;

import java.util.Scanner;
/*
 			    5 4 3 2 1 
				5 4 3 2 
				5 4 3 
				5 4 
				5
 */

public class NPattern8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
