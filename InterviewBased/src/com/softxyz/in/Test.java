package com.softxyz.in;

public class Test {

	public static void main(String[] args) {
		
		try{
			int x=5/0;
		}catch(Exception e){
			System.out.println("Exception"); 
	}
//		catch(ArithmeticException e){
//			System.out.println("ArithmeticException");     catch block of ArithmeticException is already Handled by Parent Exception.
//		}
		System.out.println("Line Line");
	}
}
