package com.matrix.in;

import java.util.Scanner;

public class ColumnWiseMax {

	public static int[] colWiseMax(int[][] mat) {

		int[] max = new int[mat[0].length];

		for (int i = 0; i < mat[0].length; i++) {
			max[i] = mat[0][i];

			for (int j = 1; j < mat.length; j++) {
				if (mat[j][i] > max[i])
					max[i] = mat[j][i];
			}
		}
		return max;
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row and Column of the Matrix:");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("Enter the " + (row * col) + " Matrix elements:");

		/* Initialization of the Matrix */

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		/* To display the Matrix */

		System.out.println("USER ENTERED MATRIX");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		

		int[] maxValue = colWiseMax(mat);
		for (int i = 0; i < maxValue.length; i++) {
			System.out.println("COLUMN " + (i + 1) + " MAX VALUES IS: " + maxValue[i]);
		}
		sc.close();
	}
}
