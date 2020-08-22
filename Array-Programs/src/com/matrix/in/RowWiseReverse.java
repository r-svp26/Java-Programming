package com.matrix.in;

import java.util.Scanner;

public class RowWiseReverse {

	public static int[][] rowWiseReverse(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length/2; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][mat[i].length - 1 - j];
				mat[i][mat[i].length - 1 - j] = temp;
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
		
		int[][] revMatrix= rowWiseReverse(mat);
		System.out.println("MATRIX AFTER ROW WISE REVESED...");
		displayMatrix(revMatrix);

	}
}
