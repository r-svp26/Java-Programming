package com.array.jspider;

// WAJP to merge two Array into New Single Array

public class MergeArray {

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

		int[] a = { 10, 12, 56, 62, 75 };
		int[] b = { 20, 30, 40 };

		int[] c = merge(a, b);

		System.out.println("ARRAY AFTER MERGED");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
