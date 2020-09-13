package com.jsp;

import java.util.Scanner;

public class ReverseArray {

	static int[] reverseArray(int[] arr) {

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		return arr;
	}

	public static void main(String[] args) {

	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of the Array");
	  int size=sc.nextInt();
	  
	  System.out.println("Enter the elements");
	  int[] arr=new int[size];
	  
	  for(int i=0;i<arr.length;i++){
		  arr[i]=sc.nextInt();
	  }
	  
	  System.out.println("REVERSED ARRAY");
	  reverseArray(arr);
	  sc.close();
	}
}
