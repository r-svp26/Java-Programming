package com.number.in;

import java.util.Scanner;

public class NPattern18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k%2 + " ");
				k++;
			}
			System.out.println();
		}
		sc.close();
	}
}
