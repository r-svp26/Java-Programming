package org.Matrix;
/*WAJPT TAKE THE INPUT FROM THE USER AND PRINT THE MATRIX*/
import java.util.Scanner;

public class Matrix_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the how many rows and column are there: ");
		int rows=sc.nextInt();
		int column=sc.nextInt();
		
		int mat[][]=new int[rows][column];
		System.out.print("Enter "+rows*column+" elements rows wise");
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.println("----------------------------------------");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
