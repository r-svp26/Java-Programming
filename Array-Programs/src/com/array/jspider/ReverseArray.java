package com.array.jspider;

// WAJP to program Reverse the Array

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " integer value:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Reversed Array:");
		for (int i = n-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
