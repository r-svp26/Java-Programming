package com.thread.in;

public class ThreadExample {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started...");
		System.out.println("---------------------");
		
		
		System.out.println("Thread-1 Info ");
		Thread t1=new Thread();
		System.out.println("Thread ID: "+t1.getId());
		System.out.println("Thread Priority: "+t1.getPriority());
		System.out.println("Thread Name: "+t1.getName());
		System.out.println("---------------------");
		
		System.out.println("Thread-2 Info ");
		Thread t2=new Thread("JSpiders");
		System.out.println("Thread ID: "+t2.getId());
		System.out.println("Thread Priority: "+t2.getPriority());
		System.out.println("Thread Name: "+t2.getName());
		System.out.println("---------------------");
		
		System.out.println("Thread-3 Info ");
		Thread t3=new Thread(new MyRunnable());
		System.out.println("Thread ID: "+t3.getId());
		System.out.println("Thread Priority: "+t3.getPriority());
		System.out.println("Thread Name: "+t3.getName());
		System.out.println("---------------------");
		
//		Thread t4=new Thread(new Runnable,"QSpiders");
//		System.out.println(t4.getId());
//		System.out.println(t4.getPriority());
//		System.out.println(t4.getName());
		
		System.out.println("Main End!");
		
	}
}
