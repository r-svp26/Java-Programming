package com.array.interview;

public class DeleteAtIndex {

	public static int[] deleteAtIndex(int[] x, int index) {

		if (index < 0 || index > x.length) {
			System.out.println("Index out of boud");
			return x;
		}
		int[] arr = new int[x.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (i < index) {
				arr[i] = x[i];
			} else {
				arr[i] = x[i + 1];
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] x = { 10, 20, 30, 40, 50, 60 };
		int[] newArr = deleteAtIndex(x, 4);

		System.out.print("MODIFIED ARRAY: ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}
