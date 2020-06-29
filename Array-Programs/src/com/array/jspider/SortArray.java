package com.array.jspider;

import java.util.Arrays;

public class SortArray {

	public static int[] sort(int[] arr) {

		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 4, 6, 8, 10, 2 };

		int[] ar = sort(arr);

		System.out.println("Array After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
