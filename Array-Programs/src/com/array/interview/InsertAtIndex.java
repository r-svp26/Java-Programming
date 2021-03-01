package com.array.interview;

public class InsertAtIndex {

	private static int[] insertAtIndex(int[] x,int index,int value) {

		if (index < 0 || index > x.length) {
			System.out.println("Index out of bound");
			return x;
		}

		int[] arr = new int[x.length + 1];
		arr[index] = value;

		for (int i = 0; i < x.length; i++) {
			if (i < index) {
				arr[i] = x[i];
			} else {
				arr[i + 1] = x[i];
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] x = { 10, 20, 30, 40, 50 };
		int[] arr = insertAtIndex(x,3,101);
		
		System.out.print("MODIFIED ARRAY: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
