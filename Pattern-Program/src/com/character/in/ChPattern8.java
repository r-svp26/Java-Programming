package com.character.in;


import java.util.Scanner;

/*	a 
	b b 
	c c c 
	d d d d 
	e e e e e  */

public class ChPattern8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (i + 96) + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
