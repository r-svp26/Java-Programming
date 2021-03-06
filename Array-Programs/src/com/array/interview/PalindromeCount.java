package com.array.interview;

import java.util.Scanner;

public class PalindromeCount {

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

	public static boolean isPalindrome(int num) {

		int rev = 0, temp = num;

		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = readArray();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean rs = isPalindrome(arr[i]);
			if (rs == true)
				count++;
		}
		System.out.println("Palindrome Number Present:" + count);
	}
}
