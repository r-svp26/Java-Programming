package com.array.interview;

import java.util.Scanner;

public class StrongCount {

	public static int[] readArray() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " integer values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

	public static boolean isStrong(int num) {
		int sum = 0, temp = num;
		do {
			int rem = num % 10;
			int fact = 1;
			while (rem > 1) {
				fact = fact * rem;
				rem--;
			}
			sum = sum + fact;
			num = num / 10;
		} while (num != 0);
		if (sum == temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = readArray();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean rs = isStrong(arr[i]);
			if (rs == true)
				count++;
		}
		System.out.println("Strong Number Present:" + count);
	}
}
