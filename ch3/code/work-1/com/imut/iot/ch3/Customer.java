package com.imut.iot.ch3;

public class Customer {
	public Furniture[] requset(int type,int num) {
		return Factory.createFurnitures(type, num);
	}
}
