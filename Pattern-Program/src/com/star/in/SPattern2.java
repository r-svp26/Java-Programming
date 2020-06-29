package com.star.in;

import java.util.Scanner;

/*
	* * * * * 
	* * * * 
	* * * 
	* * 
	* 	 
	        */

public class SPattern2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
