package com.array.interview;

public class DeleteAtIndex {

	public static int[] deleteAtIndex(int[] arr, int index) {

		if (index < 0 || index > arr.length) {
			System.out.println("Index out of boud");
			return arr;
		}

		int[] newArr = new int[arr.length - 1];
		for (int i = 0; i < newArr.length; i++) {
			if (i < index) {
				newArr[i] = arr[i];
			} else {
				newArr[i] = arr[i + 1];
			}
		}
		return newArr;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int[] newArr = deleteAtIndex(arr, 2);

		System.out.print("MODIFIED ARRAY: ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}
