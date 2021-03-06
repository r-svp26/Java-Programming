package com.matrix.in;

import java.util.Scanner;

public class ColumnWiseReverse {

	public static int[][] colWiseReverse(int[][] mat) {

		for (int i = 0; i < mat.length / 2; i++) {
			for (int j = 0; j < mat[0].length; j++) {

				int temp = mat[i][j];
				mat[i][j] =mat[mat.length - 1 - i][j];
				mat[mat.length - 1 - i][j] = temp;
			}
		}
		return mat;
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

		int[][] revMatrix = colWiseReverse(mat);
		System.out.println("MATRIX AFTER COLUMN WISE REVERSED...");
		displayMatrix(revMatrix);

	}
}
