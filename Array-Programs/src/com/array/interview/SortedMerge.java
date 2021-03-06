package com.array.interview;

public class SortedMerge {

	public static int[] merge(int[] x, int[] y) {

		int[] z = new int[x.length + y.length];
		int i = 0, j = 0, k = 0;
		while (i < x.length && j < y.length) {

			if (x[i] < y[j]) {
				z[k] = x[i];
				i++;
				k++;
			} else {
				z[k] = y[j];
				j++;
				k++;
			}
		}
		while (i < x.length) {
			z[k] = x[i];
			k++;
			i++;
		}
		while (j < y.length) {
			z[k] = y[j];
			k++;
			j++;
		}
		return z;
	}

	public static void main(String[] args) {

		int[] a = { 5, 8, 13, 18, 25 };
		int[] b = { 12, 16, 23, 26 };

		int[] c = merge(a, b);
		System.out.println("SORTED ARRAY AFTER MERGED");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
