package com.sorting.algo;

public class BubbleSort {

	public static void bubble_sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 16, 14, 5, 6, 8 };
		bubble_sort(arr);
		System.out.print("Array after Sorting:");
		for (int sorted : arr) {
			System.out.print(sorted + " ");
		}
	}
}
