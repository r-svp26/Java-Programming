package com.thread.in;

public class MainThread4 extends Thread {

	@Override
	public void run() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
