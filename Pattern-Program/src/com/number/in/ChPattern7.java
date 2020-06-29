package com.number.in;

import java.util.Scanner;

/*	A 
	B B 
	C C C 
	D D D D 
	E E E E E  */

public class ChPattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (i + 64) + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
