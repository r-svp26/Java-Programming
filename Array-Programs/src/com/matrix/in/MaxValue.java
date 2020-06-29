package com.matrix.in;

import java.util.Scanner;

public class MaxValue {

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

	public static int maxValue(int[][] mat) {

		int max = mat[0][0];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (max < mat[i][j]) {
					max = mat[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[][] mat = readMatrix();

		System.out.println("User Entered Matrix");
		displayMatrix(mat);

		System.out.print("The Max Value of the Matrix: " + maxValue(mat));
	}
}
