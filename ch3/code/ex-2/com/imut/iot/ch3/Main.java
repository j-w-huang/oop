package com.imut.iot.ch3;

/*
 *
定义一个人类（Person），该类中应该有两个私有属性，姓名（name）和年龄（age）。
定义构造方法，用来初始化数据成员。再定义显示（display）方法，将姓名和年龄打印出来。
在main方法中创建人类的实例，然后将信息显示。

 */

public class Main {
	public static void main(String[] args) {
//		A a= new A();
//		a.guess(10);
		
//		MyTime myTimer = new MyTime();
//		myTimer.addHour(3);
//		myTimer.subMinute(70);
//		System.out.println(myTimer.disaplay());
		
		Number number = new Number(1,2);
		//调用对象的toString方法
		System.out.print(number);
		
		
		Person p1 = new Person();
		p1.name = "aaa"; //-->不是p1的name，是Person的name,等价于Person.name
		p1.age = 12;
		Person p2 = new Person();
		p2.name = "bbb"; //-->不是p2的name，是Person的name,等价于Person.name
		p2.age = 13;
		
		System.out.print(p1);
		System.out.print(p2);
	}
}
