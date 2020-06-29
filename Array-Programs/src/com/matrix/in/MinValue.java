package com.matrix.in;

import java.util.Scanner;

public class MinValue {

	public static int[][] readMatrix() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row and Column of the Matrix:");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("Enter the " + (row * col) + " Matrix elements:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return mat;
	}

	public static void displayMatrix(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int minValue(int[][] mat) {
		int min = mat[0][0];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (min > mat[i][j]) {
					min = mat[i][j];
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {

		int[][] mat = readMatrix();

		System.out.println("User Entered Matrix");
		displayMatrix(mat);

		System.out.print("The Min Value of the Matrix: " + minValue(mat));
	}
}
