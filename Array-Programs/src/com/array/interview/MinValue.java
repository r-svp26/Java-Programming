package com.array.interview;

import java.util.Scanner;

public class MinValue {

	public static int getMin(int[] arr) {
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " value");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int min = getMin(arr);
		System.out.println("The smallest element:" + min);
		sc.close();
	}
}
