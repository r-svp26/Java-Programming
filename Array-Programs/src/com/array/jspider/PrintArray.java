package com.array.jspider;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of array:");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter " + size + " values");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(j+": " + arr[j]);
		}
		sc.close();
	}
}
