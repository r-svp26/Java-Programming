package com.array.in;

public class MaxValue {
	
	public static int findMax(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}	
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr={5,4,2,10,12,15};
		System.out.println("Min value is:"+(MaxValue.findMax(arr)));
	}

}
