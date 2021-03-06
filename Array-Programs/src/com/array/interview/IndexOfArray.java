package com.array.interview;

import java.util.Scanner;

public class IndexOfArray {

	public static int[] readArray() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");

		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integer value below");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int getIndexOf(int[] arr,int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = readArray();

		System.out.print("Enter the Element:");
		int ele = sc.nextInt();
		int index = getIndexOf(arr, ele);

		if (index >= 0)
			System.out.print("Index of the Element:" + index);
		else
			System.out.println("Element does not exits!");
		sc.close();
	}
}
