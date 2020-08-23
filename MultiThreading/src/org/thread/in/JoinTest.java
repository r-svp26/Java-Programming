package org.thread.in;

public class JoinTest {

	public static void main(String[] args) throws InterruptedException {
		
		JoinThread t1=new JoinThread();
		JoinThread t2=new JoinThread();
		JoinThread t3=new JoinThread();
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		
		t1.join();
		t3.start();

	}
}
