package com.array.interview;

public class InsertAtIndex {

	private static int[] insertAtIndex(int[] arr, int value, int index) {

		if (index < 0 || index > arr.length) {
			System.out.println("Index out of bound");
			return arr;
		}

		int[] newArr = new int[arr.length + 1];
		newArr[index] = value;

		for (int i = 0; i < arr.length; i++) {
			if (i < index) {
				newArr[i] = arr[i];
			} else {
				newArr[i + 1] = arr[i];
			}
		}
		return newArr;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int[] newArr = insertAtIndex(arr, 38, 5);
		
		System.out.print("MODIFIED ARRAY: ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}
