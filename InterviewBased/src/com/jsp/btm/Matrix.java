package com.jsp.btm;

public class Matrix {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30 }, { 50, 60, 70 }, { 80, 90, 95 } };
		
		System.out.println("USER ENTERED MATRIX");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
