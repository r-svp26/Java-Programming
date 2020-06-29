package com.array.interview;

// WAJP to Product of array elements

import java.util.Scanner;

public class ProductOfElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n = sc.nextInt();

		int[] arr = new int[n]; // 

		System.out.println("Enter " + n + " integer values");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		double product = 1;
		for (int i = 0; i < arr.length; i++) {
			product = product * arr[i];
		}
		System.out.println("The Product of array elements are:" + product);
		sc.close();
	}
}
