package com.array.interview;

import java.util.Scanner;

public class DuplicateCount {

	public static int countDuplicate(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				int temp = 0;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						temp++;
						arr[j] = -1;
					}
				}
				if (temp >= 1)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Array:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter the " + size + " Element:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = countDuplicate(arr);
		System.out.println(count);
		sc.close();

	}
}
