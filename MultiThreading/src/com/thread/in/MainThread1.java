package com.thread.in;

public class MainThread1 {

	public static void main(String[] args) {

		Thread t1 = new Thread();
		t1.start(); // It will execute Thread class run().

		Thread t2 = new Thread();
		t2.start(); // It will execute Runnable Interface run()
		
		System.out.println("Testing...");
	}
}
