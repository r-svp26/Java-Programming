package com.array.jspider;

// WAJP to find Biggest element of the Array

public class MaxValue {

	public static int max(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 4, 2, 10, 12, 15 };
		System.out.println("Max value is:" + (MaxValue.max(arr)));
	}
}
