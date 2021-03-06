package com.matrix.in;

import java.util.Scanner;

public class DiagonalWiseReverse {

	public static int[][] diagonalWiseReverse(int[][] mat) {

		for (int i = 0; i < mat.length / 2; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i == j) {
					int temp = mat[i][j];
					mat[i][j] = mat[mat.length - 1 - i][mat[0].length - 1 - i];
					mat[mat.length - 1 - i][mat[0].length - 1 - i] = temp;
				}
				if (i + j == mat.length - 1) {
					int temp = mat[i][j];
					mat[i][j] = mat[mat.length - 1 - i][i];
					mat[mat.length - 1 - i][i] = temp;
				}
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

		int[][] drev = diagonalWiseReverse(mat);
		System.out.println("MATRIX AFTER DIAGONAL REVERSED...");
		displayMatrix(drev);
	}
}
