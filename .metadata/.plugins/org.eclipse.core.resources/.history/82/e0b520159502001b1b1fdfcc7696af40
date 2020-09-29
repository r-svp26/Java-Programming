package com.number.in;

import java.util.Scanner;

public class NPattern21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int p = i;
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(p % 2 + " ");
				p++;
			}
			System.out.println();
		}
		sc.close();
	}
}
