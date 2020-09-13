package com.blackbuck.in;

import java.util.Scanner;

public class ClassTest {
	
	
	    public static void main(String args[] ){

	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the size"); 
	        int size=s.nextInt();

	        int[] arr=new int[size];
	        
	        System.out.println("Enter the elements"); 
	        for(int i=0;i<arr.length;i++){
	            arr[i]=s.nextInt();
	        }
			
	        // Reverse the Array
	        for(int i=arr.length-1;i>=0;i--){
	            System.out.print(arr[i]+" ");
	        }
	    }
	}


