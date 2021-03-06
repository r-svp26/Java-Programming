package com.sorting.algo;

public class SelectionSort {

	public static void selection_sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
				{
					int temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 7, 4, 10, 8, 3, 1 };
		selection_sort(arr);
		System.out.print("Array after Sorting:");
		for (int sorted : arr) {
			System.out.print(sorted + " ");
		}
	}
}
