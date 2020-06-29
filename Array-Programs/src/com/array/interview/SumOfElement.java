package com.array.interview;

// WAJP to Sum of array elements

import java.util.Scanner;

public class SumOfElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " integer values");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum * arr[i];
		}
		System.out.println("The sum array of elements are:" + sum);
		sc.close();
	}
}
