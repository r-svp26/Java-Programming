package com.character.in;

import java.util.Scanner;

/*
 					A B C D E 
					A B C D E 
					A B C D E 
					A B C D E 
					A B C D E 
 */

public class ChPattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
