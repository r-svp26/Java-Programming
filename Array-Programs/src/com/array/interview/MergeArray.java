package com.array.interview;

import java.util.Scanner;

// WAJP to take two Array from users and Merged them

public class MergeArray {

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

	public static int[] merge(int[] x, int[] y) {

		int[] z = new int[x.length + y.length];
		for (int i = 0; i < x.length; i++) {
			z[i] = x[i];
		}
		for (int i = 0; i < y.length; i++) {
			z[x.length + i] = y[i];
		}
		return z;
	}

	public static void main(String[] args) {

		System.out.println("ENTER THE FIRST ARRAY ELEMENTS");
		int[] a = readArray();

		System.out.println("ENTER THE SECOND ARRAY ELEMENTS");
		int[] b = readArray();

		int[] c = merge(a, b);
		System.out.println("ARRAY AFTER MERGED");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
