package com.array.jspider;

public class MinValue {

	public static int getMin(int[] arr) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 4, 2, 10, 12, 15 };
		System.out.println("Max value is:" + (MinValue.getMin(arr)));
	}
}
