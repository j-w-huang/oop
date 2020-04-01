package com.imut.iot.ch3;

public class Number {

	// default 访问修饰符
	int n1, n2;

	public Number(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public long addition() {
		return n1 + n2;
	}

	public long subtration() {
		return n1 - n2;
	}

	public long multiplication() {
		return n1 * n2;
	}

	public double division() {
		return n1*1.0 / n2;
	}
	
	public String toString() {
		return  "addition value is: " + this.addition() + "\r\n" +
				"subtration value is: " + this.subtration() + "\r\n" +
				"multiplication value is: " + this.multiplication() + "\r\n" +
				"division value is: " + this.division() ;
	}
}
