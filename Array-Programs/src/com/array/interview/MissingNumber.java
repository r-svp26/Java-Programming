package com.array.interview;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 3, 1, 6, 7, 2, 9, 10 };
		
		int sum = 0;
		int expSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		for (int i = 1; i <= 10; i++) {
			expSum = expSum + i;
		}
		
		System.out.println("The given array are:" + Arrays.toString(arr)); // To Print Array
		System.out.println("Missing Number Is:" + (expSum - sum));
	}
}
