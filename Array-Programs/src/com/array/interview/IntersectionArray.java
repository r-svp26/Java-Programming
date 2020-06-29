package com.array.interview;

public class IntersectionArray {

	public static int[] interSection(int[] x, int[] y) {

		int[] z = new int[x.length];
		int k = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					z[k] = x[i];
					k++;
					break;
				}
			}
		}
		int[] finalArr = new int[k];
		for (int i = 0; i < k; i++) {
			finalArr[i] = z[i];
		}
		return finalArr;
	}

	public static void main(String[] args) {

		int[] a = { 4, 6, 10, 16, 25, 24 };
		int[] b = { 3, 6, 17, 20, 16, 25, 28 };

		System.out.print("ARRAY AFTER INTERSECTION OPERATION: ");

		int[] finalArr = interSection(a, b);

		for (int i = 0; i < finalArr.length; i++) {
			System.out.print(finalArr[i] + " ");
		}
	}
}
