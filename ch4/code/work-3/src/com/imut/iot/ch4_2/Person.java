package com.imut.iot.ch4_2;

// 默认父类是Object
public class Person {
	private String name;
	
	public Person(String name) {
		//super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
