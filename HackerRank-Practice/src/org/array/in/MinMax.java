package org.array.in;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static int[] minMax(int[] arr) {

		Arrays.sort(arr);
		int min = 0, max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			min = min + arr[i];
		}
		for (int i = 1; i < arr.length; i++) {
			max = max + arr[i];
		}
		int sum[] = { min, max };
		return sum;
	}

	public static int[] readArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the " + size + " Element:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("USER ENTERED ARRAY: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
		return arr;
	}

	public static void main(String[] args) {

		int arr[] = readArray();
		int sum[] = minMax(arr);
		for (int i = 0; i < sum.length;) {
			System.out.println("\nMin and Max Summation Value: " + sum[0] + " " + sum[1]);
			break;
		}
	}
}
