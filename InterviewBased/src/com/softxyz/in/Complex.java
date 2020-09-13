package com.softxyz.in;

public final class Complex {

	private double re, im;

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	Complex(Complex c) {
		System.out.println("Copy constructor called");
		re = c.re;
		im = c.im;
	}

	@Override
	public String toString() {
		return "(" + re + "+" + im + "i)";
	}
}
