package com.matrix.in;

import java.util.Scanner;

public class ColumnWiseSum {

	public static int[] colWiseSum(int[][] mat) {

		int[] sum = new int[mat[0].length];

		for (int i = 0; i < mat[0].length; i++) {
			sum[i] = 0;

			for (int j = 0; j < mat.length; j++) {
				sum[i] = sum[i] + mat[j][i];
			}
		}
		return sum;
	}

	static int[][] readMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row and Column of the Matrix");

		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("Enter the " + row * col + " Elements");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return mat;
	}

	static void displayMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] mat = readMatrix();

		System.out.println("USER ENTERED MATRIX");
		displayMatrix(mat);

		int[] sumValue = colWiseSum(mat);
		for (int i = 0; i < sumValue.length; i++) {
			System.out.println("ROW " + (i + 1) + " TOTAL VALUES IS: " + sumValue[i]);
		}
	}
}
