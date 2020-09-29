package com.search.algo;

import java.util.Arrays;

public class BinarySearch {

	public static int binary_search(int[] arr, int key) {

		Arrays.sort(arr); // To sort the array
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid; // To return index value
			}
			if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1; // key not found
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 1, 59, 47, 75, 65, 88, 98 };
		System.out.println(BinarySearch.binary_search(arr, 65));
		
	}
}
