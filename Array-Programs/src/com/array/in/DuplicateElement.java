package com.array.in;

import java.util.Arrays;

public class DuplicateElement {

	// Using Brute Force Method
	public static void duplicate(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate elements are:" + arr[i]);
				}
			}
		}
		// Time Complexity : single for loop ---> O(n) + nested for
		// loop----->O(n^2).
	}

	// Using Sorting Method
	public static void findDuplicate(int[] arr) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("Duplicate elements found:" + arr[i]);
			}
		}
		// Time Complexity : single for loop + Sorting logic ---->O(n)+O(nlogn).
	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 12, 4, 2, 6, 2, 15, 10, 4 };

		System.out.println("-----Using Brute Force Method-------");
		DuplicateElement.duplicate(array);

		System.out.println("-----Using Sorting Method-------");
		DuplicateElement.findDuplicate(array);
	}
}
