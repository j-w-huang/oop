package com.imut.iot.ch3;

public class Person {
	//如果加了static,那么name是Person拥有的，不是Person对象实体拥有的
	//public static String name;
	public String name;
	public int age;
	
	public String toString() {
		return "name :" + name + "\r\n" + "age :" + age + "\r\n";
	}
	
}
