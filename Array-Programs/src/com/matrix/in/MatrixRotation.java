package com.matrix.in;

import java.util.Scanner;

public class MatrixRotation {

	public static int[][] rotate90dRight(int[][] mat) {

		mat=transpose(mat);
		rowWiseReverse(mat);
		return mat;
	}
	
	public static int[][] rotate90dLeft(int[][] mat) {

		mat=transpose(mat);
		colWiseReverse(mat);
		return mat;
	}
	
	public static int[][] rowWiseReverse(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length / 2; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][mat[i].length - 1 - j];
				mat[i][mat[i].length - 1 - j] = temp;
			}
		}
		return mat;
	}

	public static int[][] colWiseReverse(int[][] mat) {

		for (int i = 0; i < mat.length / 2; i++) {
			for (int j = 0; j < mat[0].length; j++) {

				int temp = mat[i][j];
				mat[i][j] = mat[mat.length - 1 - i][j];
				mat[mat.length - 1 - i][j] = temp;
			}
		}
		return mat;
	}

	public static int[][] transpose(int[][] mat) {

		int[][] trp = new int[mat[0].length][mat.length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				trp[j][i] = mat[i][j];
			}
		}
		return trp;
	}

	public static int[][] readMatrix() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row and Column of  the Matrix:");
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

	public static void main(String[] args) {

		int[][] mat = readMatrix();

		System.out.println("USER ENTERED MATRIX");
		displayMatrix(mat);
		
		int[][] rRotation= rotate90dRight(mat);
		System.out.println("90d Right Rotation OF THE MATRIX...");
		displayMatrix(rRotation);
		
		int[][] lRotation= rotate90dLeft(mat);
		System.out.println("90d Left Rotation OF THE MATRIX...");
		displayMatrix(lRotation);
		
	}
}
