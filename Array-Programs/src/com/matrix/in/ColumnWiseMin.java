package com.matrix.in;

import java.util.Scanner;

public class ColumnWiseMin {

	public static int[] colWiseMin(int[][] mat) {   ///

		int[] min = new int[mat[0].length];

		for (int i = 0; i < mat[0].length; i++) {
			min[i] = mat[0][i];
			
			for (int j = 0; j < mat.length; j++) {
				if (min[i] > mat[j][i])
					min[i] = mat[j][i];
			}
		}
		return min;
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

		int[] minValue = colWiseMin(mat);
		for (int i = 0; i < minValue.length; i++) {
			System.out.println("COLUMN " + (i + 1) + " MIN VALUES IS: " + minValue[i]);
		}
		sc.close();
	}
}
