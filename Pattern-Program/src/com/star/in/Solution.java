package com.star.in;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
	}
}
