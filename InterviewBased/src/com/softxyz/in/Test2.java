package com.softxyz.in;

public class Test2 {

	public static void main(String[] args) {

		final StringBuffer a = new StringBuffer();
		final StringBuffer b = new StringBuffer();

		new Thread() {
			public void run() {
				System.out.println(a.append("A"));
				synchronized (b) {
					System.out.println(b.append("B"));
				}
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println(b.append("C"));
				synchronized (a) {
					System.out.println(b.append("D"));
				}
			}
		}.start();
	}
}
