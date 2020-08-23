package com.thread.in;

public class Thread3Test4 {

	public static void main(String[] args) {

		MainThread3 thread3 = new MainThread3();
		MainThread4 thread4 = new MainThread4();

		thread3.start();
		/*
		 * thread3.start(); <---- IllegalThreadStateException(Thread is already
		 * started ! )
		 */
		thread4.start();
	}
}
