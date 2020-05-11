package com.imut.iot.ex8;

public class Person {
    public String name;
    
    public Person() {
    		this.name = "Frank";
    }
    
    public Person(String name) {
		this.name = name;
    }
    
    public void SayHello() {
    		System.out.println("Hello");
    }
    
    
    public String toString() {
    		return this.name;
    }
}
