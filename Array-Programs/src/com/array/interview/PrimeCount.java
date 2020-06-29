package com.array.interview;

import java.util.Scanner;

public class PrimeCount {

	public static int[] readArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " integer values");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static boolean isPrime(int num) {

		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int countPrime(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean rs = isPrime(i);
			if (rs == true) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println("ENTER THE ARRAY ELEMENTS");
		int[] arr = readArray();

		System.out.print("User Entered Array: ");
		display(arr);

		System.out.println(" ");
		int countPrime = countPrime(arr);
		System.out.println("Prime number present in the Array: " + countPrime);

	}
}
