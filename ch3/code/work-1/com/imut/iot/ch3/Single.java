package com.imut.iot.ch3;
/*
 * 1.将构造函数私有化，外部不可以再new;
 * 2.定义一个静态的变量，变量本身是自身Class类型；
 * 3.定义一个静态的方法，判断变量是否被实例化，如果没有实例化那么new一下，否则返回静态的变量实例。
 * 
 * */
public class Single {
	
	private static Single instance = null;
	
	public static Single getInstance() {
		//单例，假如说我想有10个Single可以用，怎么做？
		if(instance==null) {
			instance = new Single();
		}
		return instance;
	}
	
	private String name;
	
	private Single() {
		this.name = "single";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}

}
