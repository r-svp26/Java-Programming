 package com.array.interview;

public class ZigZagArray {

	public static int[] zigZag(int[] x, int[] y) {

		int[] z = new int[x.length + y.length];
		int k = 0;

		for (int i = 0; i < z.length;) {
			if (k < x.length) {
				z[i] = x[k];
				i++;
			}
			if (k < y.length) {
				z[i] = y[k];
				i++;
			}
			k++;
		}
		return z;
	}

	public static void main(String[] args) {

		int[] a = { 10, 12, 26, 34, 64 };
		int[] b = { 74, 65, 6, 4, 56, 17, 23 };

		int[] zigArr = zigZag(a, b);
		for (int i = 0; i < zigArr.length; i++) {
			System.out.print(zigArr[i] + " ");
		}
	}
}
