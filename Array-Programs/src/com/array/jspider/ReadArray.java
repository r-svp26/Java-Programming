package com.array.jspider;

// WAJP to initialize the Array using user input

import java.util.Scanner;

public class ReadArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");

		int n = sc.nextInt();
		double[] arr = new double[n];

		System.out.println("Enter " + n + " integer values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		System.out.println("Entered elements are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "--->" + arr[i]);
		}
		sc.close();
	}
}
