package com.thread.in;

public class MainThread5 {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("2*" + i + "=" + 2 * i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("5*" + i + "=" + 5 * i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
