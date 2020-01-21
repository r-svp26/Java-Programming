package com.patern.org;

import java.util.Scanner;

	 
  /*		*
			**
			***
			****
			***
			**
			*          */
	          
public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++){
			for(int j=num-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}	
}
