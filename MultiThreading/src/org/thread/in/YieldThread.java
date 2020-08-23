package org.thread.in;

public class YieldThread {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		JoinThread thread1=new JoinThread("JSpiders");
		JoinThread thread2=new JoinThread("QSpiders");
		
		thread1.start();
		thread1.yield();   // It indicates CPU processor for the current to be use !
		
		thread2.start();
		//System.out.println("Main Method End!");
	}
}
