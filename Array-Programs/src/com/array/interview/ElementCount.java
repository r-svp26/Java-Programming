package com.array.interview;

// WAJP to count the frequency of Specific element in the Array

public class ElementCount {

	public static int countElement(int[] arr, int ele) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 23, 27, 25, 23, 46, 23, 59 };
		int count = countElement(arr, 23);
		System.out.println("23 is present " + count + " times");
	}
}
