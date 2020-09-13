package com.sorting.algo;

public class InsertionSort {

	public static void insertion_sort(int[] arr) {
		
		int temp;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = { 5, 4, 10, 1, 2 };
		insertion_sort(arr);
		
		System.out.print("Array after Sorting:");
		for (int sorted : arr) {
			System.out.print(sorted + " ");
		}
	}
}
