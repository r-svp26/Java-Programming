package com.array.interview;

import java.util.Scanner;

public class PosNegCount {

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
	
	public static int[] countPN(int[] arr){
		
		int count[]={0,0};
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=0){
				count[0]++;
			}else{
				count[1]++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = readArray();

		System.out.print("User Entered Array: ");
		display(arr);
		
		System.out.println(" "); // Next line Only
		
		int[] countPN=countPN(arr);
		System.out.println("The Number of Positive Elements: "+countPN[0]);
		System.out.println("The Number of Negative Elements: "+countPN[1]);
	}
}
