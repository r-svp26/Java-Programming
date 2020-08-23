package org.thread.in;

public class StopThread {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		JoinThread thread = new JoinThread();

		thread.start();
		Thread.sleep(100);

	/*	thread.destroy(); <-----Destroy the main Thread.  */
		
		thread.stop(); // Dead the invoking Thread. 

	}
}
