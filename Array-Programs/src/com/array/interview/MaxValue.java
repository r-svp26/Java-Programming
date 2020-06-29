package com.array.interview;

// WAJP to find Biggest element of the Array

import java.util.Scanner;

public class MaxValue {

	/* To the read Array from users */
	public static int[] readArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

	/* To find max value of the Array */
	public static int getMax(int[] arr) {

		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] arr = readArray();

		int max = getMax(arr);
		System.out.println("The Max value of the Array:" + max);

	}
}
