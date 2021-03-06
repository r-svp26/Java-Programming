package com.matrix.in;

import java.util.Scanner;

public class DiagonalWiseMax {

	public static int[] diagonalWiseMax(int[][] mat) {

		int pmax = mat[0][0];
		int smax = mat[0][mat.length - 1];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i == j) {
					if (mat[i][j] > pmax)
						pmax = mat[i][j];
				}
				if (i + j == mat.length - 1) {
					if (mat[i][j] > smax)
						smax = mat[i][j];
				}
			}
		}
		int[] max = { pmax, smax };
		return max;
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

		int[] dmax = diagonalWiseMax(mat);
		System.out.println("PRIMARY DIAGONAL MAX VALUE IS:" + dmax[0]);
		System.out.println("SECONDARY DIAGONAL MAX VALUE IS:" + dmax[1]);
	}
}
