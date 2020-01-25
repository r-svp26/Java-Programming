package com.array.in;

import java.util.Arrays;

public class ReverseArray {

	public static void reverseArray(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = { 2, 45, 10, 35, 15, 6, 8 };
		System.out.println("Array before reverse:" + (Arrays.toString(arr)));
		
		reverseArray(arr, 0, arr.length - 1);
		System.out.println("Array after reversed:" + (Arrays.toString(arr)));
	}
}
