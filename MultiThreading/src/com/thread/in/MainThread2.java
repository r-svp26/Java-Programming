package com.thread.in;

public class MainThread2 {

	void display() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(10 * i);
			if (i == 5)
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}

	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(100 * i);
		}
	}
}
