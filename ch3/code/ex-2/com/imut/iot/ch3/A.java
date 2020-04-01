package com.imut.iot.ch3;

public class A {
	private double v;
	
	public A() {
		this.v = 10;
	}
	
	public boolean guess(double vInput) {
		if(vInput > this.v || vInput < this.v) {
			return false;
		}else {
			return true;
		}
	}

}
