package com.thread.in;

public class MainThread3 extends Thread {

	@Override
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
