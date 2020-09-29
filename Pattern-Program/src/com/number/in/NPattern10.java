package com.number.in;

import java.util.Scanner;

/*
		1 2 3 4 5 
		  1 2 3 4 
		    1 2 3 
		      1 2 
		        1 
*/

public class NPattern10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= num + 1 - i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
