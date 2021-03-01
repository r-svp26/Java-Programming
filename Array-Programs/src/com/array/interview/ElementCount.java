package com.array.interview;

// WAJP to count the frequency of Specific element in the Array

public class ElementCount {

	public static int countElement(int[] arr, int key) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 23, 27, 25, 23, 46, 12, 59 };
		int count = countElement(arr, 56);
		System.out.println("23 is present " + count + " times");
	}
}
