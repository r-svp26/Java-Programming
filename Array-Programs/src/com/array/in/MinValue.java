package com.array.in;

public class MinValue {
	
	public static int findMin(int[] arr){
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}	
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr={5,4,2,10,12,15};
		System.out.println("Min value is:"+(MinValue.findMin(arr)));
	}
}
