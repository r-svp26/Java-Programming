package com.softxyz.in;

public class MySubject {

	public static enum Subject {
		PHYSICS, MATHEMATICS, CHEMISTRY;
	}

	public static void printPhysics() {
		System.out.println("MATHEMATICS");
	}

	public static void printMathematics() {
		System.out.println("CHEMISTRY");
	}

	public static void printChemistry() {
		System.out.println("PHYSICS");
	}

	public static void main(String[] args) {

		Subject subject = Subject.PHYSICS;

		switch (subject) {
		case PHYSICS:
			printPhysics();
		case MATHEMATICS:
			printPhysics();
		case CHEMISTRY:
			printPhysics();
			break;
		}
	}
}
