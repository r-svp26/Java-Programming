package com.matrix.in;

import java.util.Scanner;

public class ElementSum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Row and column");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int sum=0;
		
		int[][] mat=new int[row][col];
		
		System.out.println("Enter the "+row*col+" Matrix Element");
		
		/* Initialization of the Matrix */
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		
		/* Addition of the Matrix Element */
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				sum=sum+mat[i][j];
			}
		}
		System.out.println("The Addition of the Matrix Element is:"+sum);
		sc.close();
	}
}
