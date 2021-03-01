package com.star.in;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("*" + " ");
		}
		System.out.println();
		System.out.println("----------");

		for (int i = 1; i <= n; i++) {
			System.out.println("*" + " ");
		}
		System.out.println();
		System.out.println("----------");
		for (int i = 2; i <= n; i++) {
			System.out.print("*" + " ");
		}
		for (int i = 1; i <= n; i++) {
			System.out.println("*" + " ");
		}

		sc.close();

	}
}
