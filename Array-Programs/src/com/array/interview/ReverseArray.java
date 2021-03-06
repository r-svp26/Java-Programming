package com.array.interview;

// WAJP to program Reverse the Array

import java.util.Scanner;

public class ReverseArray {

	/* To the read Array from users */
	public static int[] readArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " Elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

	/* To reverse the Array */
	public static int[] reverse(int[] arr) {

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = readArray();

		System.out.println("REVERSED ARRAY");
		reverse(arr);
	}
}
