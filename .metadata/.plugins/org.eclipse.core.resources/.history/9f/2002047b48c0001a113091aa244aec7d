package com.number.in;

import java.util.Scanner;

/*    A B C D E 
        A B C D 
          A B C 
            A B 
              A  */

public class ChPattern5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= num - i; k++) {
				System.out.print((char) (k + 64) + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
