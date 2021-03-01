package com.array.interview;

// WAJP to find the sum of even and odd numbers in the Array

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements of the Array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int esum = 0, osum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				esum = esum + arr[i];
			} else {
				osum = osum + arr[i];
			}
		}
		System.out.println("The sum of even number are:" + esum);
		System.out.println("The sum of odd number are:" + osum);
		sc.close();
	}
}
