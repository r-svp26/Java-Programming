package com.thread.in;

public class ThreadTest2 {

	public static void main(String[] args) {
		
		MainThread2 sthread=new MainThread2();
		
		class Thread1 extends Thread{
			@Override
			public void run(){
				sthread.display();
			}
		}
		
		class Thread2 extends Thread{
			@Override
			public void run() {
				sthread.print();
			}
		}
		
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();
	}
}
