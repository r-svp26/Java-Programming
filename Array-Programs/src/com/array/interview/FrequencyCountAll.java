package com.array.interview;

// WAJP to count the frequency of all the Only Positive Element in the Array

public class FrequencyCountAll {

	public static void main(String[] args) {

		int[] arr = { 10, -23,10, 56, -23, 76, 10};
		int size = arr.length;

		for (int i = 0; i < size; i++) {
			int count = 1;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = arr[size - 1];
					size--;
					j--;
				}
			}
			System.out.println(arr[i]+  "-->" + count);
		}
	}
}

