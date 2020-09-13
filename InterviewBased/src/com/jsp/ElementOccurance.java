package com.jsp;

import java.util.Scanner;

public class ElementOccurance {

	public static void occurance(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("First Occurance = " + i + " ");
				break;
			}
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == key) {
				System.out.println("Last Occurance = " + i + " ");
				break;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();

		System.out.println("Enter the elements");
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("USER ENTERED ARRAY");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nEnter the Key");
		int key = sc.nextInt();

		occurance(arr, key);
		sc.close();
	}
}
