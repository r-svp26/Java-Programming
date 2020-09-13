package com.array.jspider;

// WAJP to count even and odd numbers in the Array

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " Elements of the Array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ecount = 0;
		int ocount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				ecount++;
			} else {
				ocount++;
			}
		}
		System.out.println("Total Even Number Present:" + ecount);
		System.out.println("Total Odd Number Present:" + ocount);
		sc.close();
	}
}
