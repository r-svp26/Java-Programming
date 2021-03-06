package com.matrix.in;

import java.util.Scanner;

public class MatrixAddition {

	static int[][] addMatrix(int[][] x, int[][] y) {

		if (x.length != y.length && x[0].length != y[0].length) {

			return null;
		}

		int[][] z = new int[x.length][x[0].length];

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		return z;
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

		int[][] x = readMatrix();
		System.out.println("USER ENTERED FIRST MATRIX");
		displayMatrix(x);

		int[][] y = readMatrix();
		System.out.println("USER ENTERED SECOND MATRIX");
		displayMatrix(y);

		int[][] mat = addMatrix(x, y);
		System.out.println("ADDITION OF THE TWO MATRIX");
		displayMatrix(mat);

	}
}
