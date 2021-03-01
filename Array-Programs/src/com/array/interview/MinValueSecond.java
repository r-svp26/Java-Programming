package com.array.interview;

import java.util.Scanner;

public class MinValueSecond {

	/* To the read Array from users */
	public static int[] readArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

	public static int second_Min(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if (i == 1)
				break;
		}
		return arr[1];
	}

	public static void main(String[] args) {

		int[] arr = readArray();

		int sec_Min = second_Min(arr);
		System.out.println("Second Min in the Array:" + sec_Min);
	}
}
