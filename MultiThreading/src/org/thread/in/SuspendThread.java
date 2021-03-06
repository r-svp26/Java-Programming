package org.thread.in;

public class SuspendThread {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		JoinThread thread = new JoinThread("JSpiders");

		thread.start();
		Thread.sleep(100);

		thread.suspend();
		Thread.sleep(100);

		thread.resume();
	}
}
