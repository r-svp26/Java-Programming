package com.search.algo;

public class LinearSearch {

	public static int linear_search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;  // It will return index value
			}
		}
		return -1;   // key not found
	}

	public static void main(String[] args) {

		int[] arr = { 10, 23, 25, 15, 26,65 };
		System.out.println(LinearSearch.linear_search(arr,26));
	}
}
