package com.number.program;

import java.util.Scanner;

public class First_N_Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(i+ " ");
			}
		}
		sc.close();
	}
}