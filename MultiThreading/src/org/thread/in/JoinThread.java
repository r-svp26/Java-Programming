package org.thread.in;

/* join() */

public class JoinThread extends Thread {

	public JoinThread(String name) {
		super(name);
	}

	public JoinThread() {
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "<=>" + Thread.currentThread().getName());
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
