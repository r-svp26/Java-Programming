package com;

public class Main {
	int x = 10;

	public void getX() {
		int x = 20;
		System.out.println(x);
		System.out.println(this.x);

	}

	public synchronized static void main(String[] args) {
		System.out.println("Hello World");
		Main ms = new Main();
		ms.getX();
		System.out.println(ms.x);
	}
}
