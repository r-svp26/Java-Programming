package com;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the Number!");
		int n = sc.nextInt();

		int low = 0, high = 100;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (n == mid) {
				System.out.println("Magic Number is:" + mid);
				break;
			} else if (n < mid) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		sc.close();
	}
}
