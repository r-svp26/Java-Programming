package com.array.jspider;

// WAJP to count the positive and negative elements in the Array

import java.util.Scanner;

public class PositiveNegativeCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements of the Array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int pcount = 0;
		int ncount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				pcount++;
			} else {
				ncount++;
			}
		}
		System.out.println("The total number of positive elements are:" + pcount);
		System.out.println("The total number of negative elements are:" + ncount);
		sc.close();
	}
}
