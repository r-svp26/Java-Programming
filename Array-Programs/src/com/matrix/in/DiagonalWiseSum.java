package com.matrix.in;

import java.util.Scanner;

public class DiagonalWiseSum {

	public static int[] diagonalWiseMax(int[][] mat) {

		int psum = 0;
		int ssum = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i == j) {
					psum=psum+mat[i][j];
				}
				if (i + j == mat.length - 1) {
					ssum=ssum+mat[i][j];
				}
			}
		}
		int[] max = { psum, ssum };
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

		int[] dsum = diagonalWiseMax(mat);
		System.out.println("PRIMARY DIAGONAL TOTAL VALUE IS:" + dsum[0]);
		System.out.println("SECONDARY DIAGONAL TOTAL VALUE IS:" + dsum[1]);
	}
}
