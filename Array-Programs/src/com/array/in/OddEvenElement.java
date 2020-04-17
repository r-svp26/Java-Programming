package com.array.in;

public class OddEvenElement {
	public static void main(String[] args) {

		int[] arr = { 10, 13, 25, 20, 27, 33 };

		int oddCount = 0;
		int evenCount = 0;

		System.out.println("The Even elements are: " );
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("The No. of Even elements: " + evenCount);
		
		System.out.println("---------------------------");
		
		System.out.println("The Odd elements are: " );
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("The No. of Odd elements: " + oddCount);
	}
}
