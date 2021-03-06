package org.array.in;

import java.util.Scanner;

public class CountCandle {

	public static int countCandle(int[] arr) {

		int count = 0,max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == max) {
				count++;
			}
		}
		return count;
	}

	public static int[] readArray() {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

	public static void main(String[] args) {

		int arr[] = readArray();
		int count = countCandle(arr);
		System.out.println(count);
	}
}
