package com.matrix.in;

import java.util.Scanner;

public class Transpose {
	
	public static int[][] transpose(int[][] mat){
		
		int[][] trp=new int[mat[0].length][mat.length];
		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				trp[j][i]=mat[i][j];
			}
		}
		return trp;
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
		
		int[][] transpose = transpose(mat);
		System.out.println("TRANSPOSE OF THE MATRIX...");
		displayMatrix(transpose);
	}
}
