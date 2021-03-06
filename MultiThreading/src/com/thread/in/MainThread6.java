package com.thread.in;

/* Current Thread Info */

public class MainThread6 {

	public static void main(String[] args) {
		
		Thread t1=new Thread();
		
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		
		t1.setName("JSP-1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.setPriority(8);
		System.out.println(t1.getPriority());
		
		System.out.println("Thread Info:"+t1); // It'll invoke the toString() of Thread class.
		
		System.out.println("-------Current Thread Info-------------");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());

	}
}
