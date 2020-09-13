package com.softxyz.in;

public class TestDemo implements Runnable{
	
	public void run(){
		System.out.printf("%d",3);
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread=new Thread(new TestDemo());
		thread.start();
		System.out.printf("%d",1);
		thread.join();
		System.out.printf("%d",2);
	}
}
