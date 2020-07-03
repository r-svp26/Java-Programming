package com.array.interview;

// WAJP to count the frequency of all the Only Positive Element in the Array

public class FrequencyCount {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 16, 27, 20, 23, 46, 76, 27, 16 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						arr[j] = -1;
					}
				}
				System.out.println(arr[i] + "-->" + count);
			}
		}
	}
}
