package com.sorting.algo;

public class BubbleSort {

	public static void bubble_sort(int[] arr) {
		int flag, temp;
		for (int i = 0; i < arr.length - 1; i++) {
			flag = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
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