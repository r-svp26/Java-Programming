package com.array.interview;

import java.util.Scanner;

public class EvenOddCount {

	public static int[] readArray() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");

		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integer value below");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] countEvenOdd(int[] arr) {

		int[] count = { 0, 0 };
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] % 2]++;
		}
		return count;
	}

	/*
	 * int[] count = { 0, 0 }; for (int i = 0; i < arr.length; i++) {
	 * if(arr%2==0) count[0]++; else count[1]++; } return count; }
	 */

	public static void main(String[] args) {

		System.out.println("READ THE ARRAY ELEMENTS");
		int[] arr = readArray();

		System.out.print("User Entered Array: ");
		display(arr);

		System.out.println(" "); // Next Line Only!

		int[] countarr = countEvenOdd(arr);
		System.out.println("Number of Even Elements: " + countarr[0]);
		System.out.println("Number of Odd Elements: " + countarr[1]);
	}
}
