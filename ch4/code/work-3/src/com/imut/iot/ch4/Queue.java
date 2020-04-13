package com.imut.iot.ch4;

import java.util.Vector;

public class Queue {
	private Vector<Object> vec = null;
    
	//系统默认值10
	private int size = 10;
    
	public Queue(int size) {
		this.vec = new Vector<Object>();
		//可以被覆盖
		this.size = size;
	}
	
	public void Push(Object obj) throws IndexOutOfBoundsException{
		if(this.vec.size() >= this.size) {
			throw new IndexOutOfBoundsException();
		} else {
			this.vec.add(obj);
		}
	}
	
	public Object Pop() {
		Object retObj = this.vec.elementAt(0);
		this.vec.remove(0);
		return retObj;
	}
	
	public Object elementAt(int i) {
		return this.vec.elementAt(i);
	}
	
	public int Length() {
		return this.vec.size();
	}
	
	public boolean isFully() {
		return this.vec.size() >= this.size;
	}
	
	public boolean isEmpty() {
		return this.vec.isEmpty();
	}

}
