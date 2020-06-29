package com.number.in;

import java.util.Scanner;

/*	1 1 1 1 1  
   	2 2 2 2 2  
	3 3 3 3 3  
	4 4 4 4 4  
	5 5 5 5 5  */

public class NPattern2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
