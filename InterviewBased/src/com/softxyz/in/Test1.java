package com.softxyz.in;

public class Test1 {

	public static void main(String[] args) {

		int value = 3, sum = 6 + --value;
		System.out.println(sum);
		int data=0;
		for(int i=0;i<10;i++){
			 data = --value + ++value / sum++ * value++ + sum % value--;
			
		}
		System.out.println(data);
	}
}



